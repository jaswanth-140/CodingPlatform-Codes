class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int i;
        int[] min=new int[n];
        int[] max=new int[n];
        int temp=nums[n-1];
        min[n-1]=temp;
        for(i=n-2;i>=0;i--)
        {
            temp=Math.min(temp,nums[i]);
            min[i]=temp;
        }

        int temp1=nums[0];
        max[0]=temp1;
        for(i=1;i<n;i++)
        {
            temp1=Math.max(temp1,nums[i]);
            max[i]=temp1;
        }
        int ans=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            ans=max[i]-min[i];
            if(ans<=k)
            {
                return i;
            }
        }
        return -1;
    }
}