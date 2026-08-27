class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        int i;
        for(i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
        int j=k;
        for(i=0;i<=nums.length;i++)
        {
            if(j%k==0)
            {
                if(!l.contains(j))
                {
                    return j;
                }
            }
            j+=k;
        }
        return j+k;
    }
}