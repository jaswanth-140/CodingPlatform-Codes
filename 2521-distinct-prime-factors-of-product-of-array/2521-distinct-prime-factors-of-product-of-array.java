class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            solve(nums[i],s);
        }
        return s.size();
    }

    public void solve(int n,Set<Integer> s)
    {
        int[] lpf=new int[n+1];
        int i;
        for(i=0;i<=n;i++)
        {
            lpf[i]=i;
        }

        for(i=2;i*i<=n;i++)
        {
            if(lpf[i]==i)
            {
                for(int j=i*i;j<=n;j=j+i)
                {
                    if(lpf[j]==j)
                    {
                        lpf[j]=i;
                    }
                }
            }
        }

        while(n>1)
        {
            s.add(lpf[n]);
            n=n/lpf[n];
        }
    }
}