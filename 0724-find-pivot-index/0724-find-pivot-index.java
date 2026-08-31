class Solution {
    public int pivotIndex(int[] nums) {
        int i;
        int n=nums.length;
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int temp=0;
        for(i=0;i<n;i++)
        {
                if(temp==sum-nums[i]-temp)
                {
                    return i;
                }
                temp+=nums[i];
        }
        return -1;
    }
}