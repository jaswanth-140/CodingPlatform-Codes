/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> l=new ArrayList<>();
        int i;
        if(root==null)
        {
            return l;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> temp=new ArrayList<>();
            int s=q.size();
            for(i=0;i<s;i++)
            {
                Node t=q.remove();
                temp.add(t.val);
                for(Node c:t.children)
                {
                    q.add(c);
                }
            }
            l.add(temp);
        }
        return l;
    }
}