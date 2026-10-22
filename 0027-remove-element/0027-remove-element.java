class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i;
        int  x=0;
        for(i=0;i<n;i++)
        {
           if(nums[i]==val)
           {
            continue;
           }
           else
           {
            nums[x]=nums[i];
            x++;
           }
        }
        return x;
    }
}