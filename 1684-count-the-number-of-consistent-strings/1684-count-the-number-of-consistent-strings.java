class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int freq[]=new int[26];
        int i;
        for(i=0;i<allowed.length();i++)
        {
            freq[allowed.charAt(i)-'a']++;
        }

        int count=0;
        for(i=0;i<words.length;i++)
        {
            String s=words[i];
            boolean temp=true;

            for(int j=0;j<s.length();j++)
            {
                if(freq[s.charAt(j)-'a']==0)
                {
                    temp=false;
                    break;
                }
            }

            if(temp)
            {
                count++;
            }
        }
        return count;
    }
}