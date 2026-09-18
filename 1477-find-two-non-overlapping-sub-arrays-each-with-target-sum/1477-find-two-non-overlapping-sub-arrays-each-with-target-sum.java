class Solution {
    public int minSumOfLengths(int[] arr, int t) {
        int n=arr.length;
        int we=0,ws=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;

        int[] best=new int[n];
        Arrays.fill(best,Integer.MAX_VALUE);
        for(we=0;we<n;we++)
        {
            sum+=arr[we];
            while(sum>t)
            {
                sum-=arr[ws];
                ws++;
            }

            if(sum==t)
            {
                int len=we-ws+1;

                if(ws>0 && best[ws-1]!=Integer.MAX_VALUE)
                {
                    ans=Math.min(ans,len+best[ws-1]);
                }

                minLen=Math.min(minLen,len);
            }

            best[we]=minLen;
        }

        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}