class Solution {
    public int reverse(int x) {
        int a=0;
        while(x!=0){
            int rem=x%10;
            x/=10;
            if(a>Integer.MAX_VALUE/10||(a==Integer.MAX_VALUE/10 && rem>7)){
                return 0;
            }
            if(a<Integer.MIN_VALUE/10 ||(a==Integer.MIN_VALUE/10&&rem<-8)){
                return 0;
            }
            a=a*10+rem;

        }
        return a;
    }
}