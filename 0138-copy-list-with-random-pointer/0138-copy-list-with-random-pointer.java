/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        {
            return null;
        }

        Node temp=head;

        while(temp!=null)
        {
            Node nn=new Node(temp.val);
            nn.next=temp.next;
            temp.next=nn;
            temp=nn.next;
        }

        temp=head;

        while(temp!=null)
        {
            if(temp.random!=null)
            {
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        Node dummy=new Node(-1);
        Node tail=dummy;
        temp=head;

        while(temp!=null)
        {
            Node a=temp.next;
            temp.next=a.next;
            tail.next=a;
            tail=a;

            temp=temp.next;
        }
        return dummy.next;
    }
}