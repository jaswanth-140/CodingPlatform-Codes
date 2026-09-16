class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        int i;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }

        for(int ele:m.values())
        {
            s.add(ele);
        }

        if(m.size()==s.size())
        {
            return true;
        }
        return false;
    }
}