class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd=0, even=1, sum=0, tot=0, mod=1000000007;
        for(int n : arr) {
            sum = (sum + n) % 2;
            if(sum % 2 == 0) {
                tot = (tot + odd) % mod;
                even++;
            } else {
                tot = (tot + even) % mod;
                odd++;
            }
        }
        return tot;
    }
}
