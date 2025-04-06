class Solution {
    public int divide(int dividend, int divisor) {
        long c=(long)dividend/divisor;
        return (int)Math.ceil(c);
    }
}