class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> z=new LinkedList<>();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                q.add(nums[i]);
            }
            else
            {
                z.add(0);
            }
        }
        int j=0;
        while(!q.isEmpty())
        {
            nums[j]=q.remove();
            j++;
        }
        while(!z.isEmpty())
        {
            nums[j]=z.remove();
            j++;
        }

    }
}