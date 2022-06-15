//https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       
        for(int i = 0; i< nums.length; i++){
            int comp = target - nums[i];
            
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            
            map.put(nums[i],i);
        }
        
        return new int[] {-1,-1};
    }
}

/*
 int a = 0;
        int b = nums.length - 1;
        while(a <= b){
            int sum = nums[a] + nums[b];
            if(sum > target){
                if(a > b) a++;
                else b--;
            }else if(sum < target){
                if(a > b) b--;
                else a++;
            }else{
                return new int[]{a, b};
            }
        }
        
        return new int[] {a,b};
*/
