class Solution {
    public int reverseDegree(String s) {
        int sum = 0, i = 1;
        for(char ch : s.toCharArray()) {
            int val = (ch-'0') - 48;
            sum += (i++)* (27-val);
        }
        return sum;
    }
}