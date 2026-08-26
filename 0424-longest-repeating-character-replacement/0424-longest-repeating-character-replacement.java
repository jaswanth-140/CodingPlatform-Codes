class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        Map<Character,Integer> m=new HashMap<>();
        int i=0,j=0;
        int count=0;
        int max=0;
        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
            max=Math.max(max,m.get(ch));
            if(i-j+1-max>k)
            {
                m.put(s.charAt(j),m.get(s.charAt(j))-1);
                if(m.get(s.charAt(j))==0)
                {
                    m.remove(s.charAt(j));
                }
                j++;
            }
            count=Math.max(count,i-j+1);
        }
        return count;
    }
}