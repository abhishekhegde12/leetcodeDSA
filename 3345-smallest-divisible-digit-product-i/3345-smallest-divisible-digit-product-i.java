class Solution {
    public int smallestNumber(int n, int t) {
        if((n%10 == 0) && (t%2 == 0))
            return n;
        int prod = 1, temp = n;
        while(temp > 0) {
            prod *= temp%10;
            temp /= 10;
        } 
        if(prod % t == 0) return n;
        return smallestNumber(n+1, t);
    }
}