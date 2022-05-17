class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i-1] == nums[i]) continue;
            
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                int current_sum = nums[i] + nums[start] + nums[end];
                if(current_sum > target){
                    end--;
                }else{
                    start++;
                }
                
                if(Math.abs(current_sum - target) < Math.abs(result - target)){
                    result = current_sum;
                }
                
            }
            
        }
        return result;
    }
}
