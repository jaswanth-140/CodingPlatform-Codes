class Solution {
    public boolean isValid(String st) {
        char[] ch=st.toCharArray();
        int i;
        int n=ch.length;
        Stack<Character> s=new Stack<>();
        for(i=0;i<n;i++)
        {
            if(!s.isEmpty())
            {
                if(ch[i]==')'&&s.peek()=='(')
                {
                    s.pop();
                }
                else if(ch[i]==']'&&s.peek()=='[')
                {
                    s.pop();
                }
                else if(ch[i]=='}'&&s.peek()=='{')
                {
                    s.pop();
                }
                else
                {
                    s.push(ch[i]);
                }
            }
            else
            {
            s.push(ch[i]);
            }
        }

        if(s.isEmpty())
        {
            return true;
        }
        return false;
    }
}