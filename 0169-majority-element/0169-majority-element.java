class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        int i;
        for(i=0;i<n;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }

        int ans=0;
        for(int ele:m.keySet())
        {
            if(m.get(ele)>n/2)
            {
                ans=ele;
                break;
            }
        }
        return ans;
    }
}