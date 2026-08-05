class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int i = 0, num = nums[0];
        while(i < nums.length) {
            if(nums[i] == num) i++;
            else res.add(num);
            num++;
        }
        return res;
    }
}