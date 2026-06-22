class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        
        for(char ch : text.toCharArray()) {
            switch(ch) {
                case 'b' : arr[0]++;
                        break;
                case 'a' : arr[1]++;
                        break;
                case 'l' : arr[2]++;
                        break;
                case 'o' : arr[3]++;
                        break;
                case 'n' : arr[4]++;
                        break;
            }
        }
        int count = 0;
        System.out.println(Arrays.toString(arr));
        
        while(arr[0] > 0) {
            int wc = 0;
            for(int i = 0; i < arr.length; i++) {
                if((i == 2 || i == 3) && arr[i] > 1) {
                    arr[i] -= 2;
                    wc += 2;
                } else if(arr[i] > 0){
                    arr[i]--;
                    wc++;
                }
            }
            System.out.println(wc);
            if(wc == 7) count++;
        }
        return count;
    }
}