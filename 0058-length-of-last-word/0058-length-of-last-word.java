class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.split("\\s+");
        String temp=st[st.length-1];
        return temp.length();
    }
}