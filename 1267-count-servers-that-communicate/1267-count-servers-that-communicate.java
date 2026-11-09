class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int i,j;
        int[] rowcount=new int[m];
        int[] colcount=new int[n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    rowcount[i]++;
                    colcount[j]++;
                }
            }
        }

        int count=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==1&&(rowcount[i]>1||colcount[j]>1))
                {
                    count++;
                }
            }
        }

        return count;
    }
}