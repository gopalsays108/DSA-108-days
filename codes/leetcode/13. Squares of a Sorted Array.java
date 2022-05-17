// https://leetcode.com/problems/squares-of-a-sorted-array/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        if(length == 1){
            return new int[]{(nums[0] * nums[0])};
        }
        int plus_pointer = 0;
        
        while(plus_pointer < length && nums[plus_pointer] <= 0 ){
            plus_pointer++;
        }
        int minus = plus_pointer - 1;
        int[] arr  = new int[length];
        int counter  = 0;
      
        while(plus_pointer < length && minus >= 0){
         //               System.out.println(plus_pointer + " " + minus);

            if(nums[plus_pointer] < nums[minus] * -1){
                arr[counter++] = nums[plus_pointer] * nums[plus_pointer];
                plus_pointer++;
            }else {
                arr[counter++] = nums[minus] * nums[minus];
                minus--;
            }
        }
        
        while(plus_pointer < length){
            arr[counter++] = nums[plus_pointer] * nums[plus_pointer];
            plus_pointer++;
        }
        
        while(minus >= 0){
            arr[counter++] = nums[minus] * nums[minus];
            minus--;
        }
        
        return arr;
    }
}
