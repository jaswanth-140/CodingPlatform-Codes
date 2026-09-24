class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            int sum=solve(nums[i]);
            if(sum==i)
            {
                return i;
            }
        }
        return -1;
    }

    public int solve(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}