class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] pre=new int[n+1];
        pre[0]=0;
        for(int i=0;i<n;i++)
        {
            pre[i+1]=pre[i]+gain[i];
        }
        Arrays.sort(pre);
        return pre[n];
    }
}