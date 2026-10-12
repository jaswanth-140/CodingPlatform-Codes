class Solution {
    public int count(int coins[], int sum) {
        int n=coins.length;
        int[][] m=new int[n+1][sum+1];
        int i,j;
        for(i=0;i<n+1;i++)
        {
            m[i][0]=1;
        }
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=sum;j++)
            {
                int ithcoin=coins[i-1];
                int exc=m[i-1][j];
                int inc=0;
                if(ithcoin<=j)
                {
                    inc=m[i][j-ithcoin];
                }
                m[i][j]=inc+exc;
            }
        }
        return m[n][sum];
    }
}