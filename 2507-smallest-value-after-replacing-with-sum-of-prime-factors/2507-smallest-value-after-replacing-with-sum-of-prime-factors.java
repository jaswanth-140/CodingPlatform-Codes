class Solution {
    public int smallestValue(int n) {
        int temp=0;
        while(true)
        {
            temp=solve(n);
            if(n==temp)
            {
                return n;
            }
            n=temp;
        }
    }
    public int solve(int n)
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
        int sum=0;
        while(n>1)
        {
            sum+=lpf[n];
            n=n/lpf[n];
        }
        return sum;
    }
}