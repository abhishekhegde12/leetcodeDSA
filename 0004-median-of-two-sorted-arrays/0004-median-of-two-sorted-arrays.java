class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        
        int[] nums = new int[len];
        int j = 0;
        for(int i : nums1) nums[j++] = i; 
        for(int i : nums2) nums[j++] = i;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(len % 2 != 0) 
            return nums[len/2];
        return (double)(nums[len/2] + nums[(len/2)-1])/2; 
    }
}