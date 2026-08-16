class Solution {
    public boolean isPalindrome(String s) {
        String nyi = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = nyi.length() - 1;
        while (left < right) {
            if (nyi.charAt(left) != nyi.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}