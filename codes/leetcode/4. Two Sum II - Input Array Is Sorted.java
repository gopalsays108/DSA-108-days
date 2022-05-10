class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer_1 = 0;
        int pointer_2 = numbers.length -1;
        
        while(pointer_1 <= pointer_2){
            int sum = numbers[pointer_1] + numbers[pointer_2];
            if(sum > target){
                pointer_2--;
            }else if(sum < target){
                pointer_1++;
            }else{
                return new int[] {pointer_1+1, pointer_2+1};
            }
        }
        
        return new int[]{pointer_1+1,pointer_2+1};
    }
}
