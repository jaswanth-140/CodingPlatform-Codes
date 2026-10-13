class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int we=0,ws=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(we=0;we<n;we++)
        {
            sum+=nums[we];
            while(sum>=target)
            {
                min=Math.min(min,we-ws+1);
                sum-=nums[ws];
                ws++;
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return 0;
        }
        return min;
    }
}