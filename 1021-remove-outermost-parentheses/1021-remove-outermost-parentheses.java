class Solution {
    public String removeOuterParentheses(String s) {
        char[] a=s.toCharArray();
        int i;
        String ans="";
        Stack<Character> st=new Stack<>();
        for(i=0;i<a.length;i++)
        {
            if(a[i]=='(')
            {
                if(!st.isEmpty())
                {
                    ans+=a[i];
                }
                st.push(a[i]);
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                {
                    ans+=a[i];
                }
            }
        }
        return ans;
    }
}