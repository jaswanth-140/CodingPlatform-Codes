class Solution {
    public int minimumDeletions(int[] nums) {
        Deque<Integer> q=new ArrayDeque<>();
        Deque<Integer> d=new ArrayDeque<>();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            q.addLast(nums[i]);
            d.addLast(nums[i]);
        }
        int j=0;
        int min=Integer.MAX_VALUE;
        int a=0;
        int max=Integer.MIN_VALUE;
        int b=0;

        while(!q.isEmpty())
        {
            if(min>q.peek())
            {
                min=q.peek();
                a=j;
            }
            if(max<q.peek())
            {
                max=q.peek();
                b=j;
            }
            j++;
            q.remove();
        }
        int left=Math.min(a,b);
        int right=Math.max(a,b);

        int ans=Math.min(right+1,Math.min(n-left,left+1+n-right));
        return ans;
    }
}