class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int maxarea = 0;
        while(left<right){
            int currentarea = Math.min(heights[left],heights[right])*(right-left);
            maxarea = Math.max(maxarea,currentarea);

            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return maxarea;
        
        
    }
}
