class Solution {
    public int removeDuplicates(int[] num) {
        int n=num.length;
        TreeMap<Integer,Integer> m=new TreeMap<>();
        int i;
        for(i=0;i<n;i++)
        {
            m.put(num[i],m.getOrDefault(num[i],0)+1);
        }
        int k=m.size();
        i=0;
        for(int ele:m.keySet())
        {
            num[i]=ele;
            m.put(ele,m.get(ele)-1);
            if(m.get(ele)>=1)
            {
                num[i+1]=ele;
                i++;
                m.put(ele,m.get(ele)-1);
            }
            i++;
        }
        return i;
    }
}