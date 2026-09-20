class Solution {
    public int minOperations(String[] a) {
        Stack<String> s=new Stack<>();
        int i;
        int n=a.length;
        for(i=0;i<n;i++)
        {
            if(a[i].equals("./"))
            {
                continue;
            }
            else if(a[i].equals("../"))
            {
                if(!s.isEmpty())
                {
                s.pop();
                }
            }
            else
            {
                s.push(a[i]);
            }
        }

        int count=0;
        while(!s.isEmpty())
        {
            count++;
            s.pop();
        }
        return count;
    }
}