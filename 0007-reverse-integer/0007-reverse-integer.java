class Solution {
    public int reverse(int x) {
        //String s="";
        long rev=0;
        int temp=x;
        x=Math.abs(x);
        while(x>0)
        {
            int rem=x%10;
            rev=rem+rev*10;
            x=x/10;
        }
        if(temp<0)
        {
            rev=-rev;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
        {
            return 0;
        }
       
            return (int)rev;
        
    }
}