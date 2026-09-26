class Solution {
    public String evaluate(String s, List<List<String>> k) {
        int i;
        Map<String,String> m=new HashMap<>();
        for(i=0;i<k.size();i++)
        {
            m.put(k.get(i).get(0),k.get(i).get(1));
        }

        StringBuilder ans=new StringBuilder();

        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
               int j=i+1;
               while(s.charAt(j)!=')')
               {
                   j++;
               }
               
               String temp=s.substring(i+1,j);
               if(m.containsKey(temp))
               {
                   ans.append(m.get(temp));
               }
               else
               {
                   ans.append("?");
               }
               i=j;
            }
            else
            {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}