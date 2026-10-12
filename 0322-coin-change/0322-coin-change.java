class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] m=new int[n+1][amount+1];
        int i,j;
        for(i=1;i<=amount;i++)
        {
            m[0][i]=Integer.MAX_VALUE;
        }

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=amount;j++)
            {
                int ithcoin=coins[i-1];
                int exc=m[i-1][j];
                int inc=0;
                if(ithcoin<=j)
                {
                    inc=m[i][j-ithcoin];
                    if(inc!=Integer.MAX_VALUE)
                    {
                        inc=1+inc;
                    }
                    m[i][j]=Math.min(exc,inc);
                }
                else
                {
                    m[i][j]=exc;
                }
            }
        }
        if(m[n][amount]==Integer.MAX_VALUE)
        {
            return -1;
        }
        return m[n][amount];
    }
}