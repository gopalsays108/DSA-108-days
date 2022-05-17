//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0) return 0;
        
        int start = 0;
        int end = height.length - 1;
        int ans = 0;
        while(start < end){
            if(height[start] < height[end]){
                int water = height[start] * (end-start);
                ans = Math.max(ans,water);
                start++;
            }else{
                int water = height[end] * (end-start);
                ans = Math.max(ans,water);
                end--;
            }
        }        
        return ans;
    }
}
