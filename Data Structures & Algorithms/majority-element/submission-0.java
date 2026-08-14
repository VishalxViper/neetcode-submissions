class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0, majority = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > majority) {
                ans = nums[i];
                majority = map.get(nums[i]);
            }
        }
        return ans;
    }
}