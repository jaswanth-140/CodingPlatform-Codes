class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length();
       int we=0,ws=0;
       int max=Integer.MIN_VALUE;
       Map<Character,Integer> m=new HashMap<>();
       for(we=0;we<n;we++)
       {
         char ch=s.charAt(we);
         m.put(ch,m.getOrDefault(ch,0)+1);
         while(m.get(ch)>1)
         {
            char temp=s.charAt(ws);
            m.put(temp,m.get(temp)-1);
            ws++;
         }
         max=Math.max(max,we-ws+1);
       }
       if(max==Integer.MIN_VALUE)
       {
        return 0;
       }
       return max;
    }
}