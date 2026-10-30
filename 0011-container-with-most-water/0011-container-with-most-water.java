class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=Integer.MIN_VALUE;
        while(i<height.length&&j>0)
        {
            int h=Math.min(height[j],height[i]);
            int w=j-i;
            int a=h*w;

            max=Math.max(max,a);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max;
    }
}