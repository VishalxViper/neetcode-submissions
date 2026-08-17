class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        // puri array rev
        reverse(nums, 0, nums.length - 1);
        // k tk reverse
        reverse(nums, 0, k - 1);
        // Remaining ele 
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}