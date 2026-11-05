class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int  i,j;
        int count=0;
        for(i=0;i<arr1.length;i++)
        {
            boolean t=true;
            for(j=0;j<arr2.length;j++)
            {
                if(Math.abs(arr1[i]-arr2[j])<=d)
                {
                    t=false;
                    break;
                }
            }
            if(t)
            {
                count++;
            }
        }
        return count;
    }
}