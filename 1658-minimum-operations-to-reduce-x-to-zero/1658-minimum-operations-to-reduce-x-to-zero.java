class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int i;
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
        }

        int t=sum-x;

        if(t<0)
        {
            return -1;
        }

        if(t==0)
        {
            return n;
        }

        int we=0,ws=0;
        int temp=0;
        int max=-1;
        for(we=0;we<n;we++)
        {
            temp+=nums[we];
            while(temp>t&&ws<=we)
            {
                temp-=nums[ws];
                ws++;
            }

            if(temp==t)
            {
                max=Math.max(max,we-ws+1);
            }
        }

        if(max==-1)
        {
            return -1;
        }

        return n-max;
    }
}