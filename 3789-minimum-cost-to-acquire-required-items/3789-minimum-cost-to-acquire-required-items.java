class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long a=Math.min(need1,need2);
        long b=Math.max(need1,need2);

        long c=(long)need1*cost1+(long)need2*cost2;
        long d=a*costBoth+(need1-a)*cost1+(need2-a)*cost2;
        long e=b*costBoth;

        return Math.min(c,Math.min(d,e));
    }
}