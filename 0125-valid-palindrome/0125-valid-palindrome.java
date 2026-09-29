class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder t=new StringBuilder();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                t.append(s.charAt(i));
            }
        }
        s=t.toString();

        for(i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}