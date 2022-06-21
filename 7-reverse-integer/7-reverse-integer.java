class Solution {
    public int reverse(int x) {
        int r,temp=x;
        long sum = 0;
        while(x!=0){
            r = x%10;
            sum = (sum*10) + r;
            x = x/10;
        }
        if((temp>=0 && sum>Integer.MAX_VALUE) || (temp<0 && sum<Integer.MIN_VALUE))
                return 0;
        return (int) sum;
    }
}