class Solution {
    public int maxDepth(String s) {
        char[] c=s.toCharArray();
        int i;
        int n=c.length;
        int max=0;
        int temp=0;
        for(i=0;i<n;i++)
        {
            if(c[i]=='(')
            {
                max++;
            }
            else if(c[i]==')')
            {
                temp=Math.max(temp,max);
                max--;
            }
        }
        return temp;
    }
}