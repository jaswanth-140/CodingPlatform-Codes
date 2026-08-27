class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        Deque<Integer> d=new ArrayDeque<>();
        int i,j=0;
        for(i=0;i<n;i++)
        {
            if(!d.isEmpty()&&d.peekFirst()<=i-k)
            {
                d.removeFirst();
            }

            while(!d.isEmpty()&&nums[d.peekLast()]<=nums[i])
            {
                d.removeLast();
            }
            d.addLast(i);

            if(i>=k-1)
            {
                ans[j]=nums[d.peekFirst()];
                j++;
            }
        }
            return ans;
    }
}