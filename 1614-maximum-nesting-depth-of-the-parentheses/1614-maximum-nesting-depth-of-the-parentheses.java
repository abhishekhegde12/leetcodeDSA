class Solution {
    public int maxDepth(String s) {
        int count=0,maximum=0;
        for(char c:s.toCharArray()){
            if(c=='(')count++;
            maximum=Math.max(count,maximum);
            if(c==')')count--;
        }
        return maximum;
    }
}