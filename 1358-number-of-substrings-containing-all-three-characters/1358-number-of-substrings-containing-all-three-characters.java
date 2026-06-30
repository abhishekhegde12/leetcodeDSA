class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int a=-1,b=-1,c=-1;

        int i=0;
        for(char x:s.toCharArray()){
            if(x=='a')a=i;
            if(x=='b')b=i;
            if(x=='c')c=i;

            if(i>1)
                count+=Math.min(a,Math.min(b,c))+1;
            i++;
        }
        return count;    
    }
}