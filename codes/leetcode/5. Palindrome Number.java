class Solution {
    public boolean isPalindrome(int x) {
        //base case check
        if(x == 0) return true;
        
        if(x < 00 || x % 10 == 0)return false;
        
        int reveresed_int  = 0;
        while(x > reveresed_int){
            int pop = x % 10;
            x /= 10;
            reveresed_int = (reveresed_int * 10) + pop;
        }        
        
        if(x == reveresed_int || x == reveresed_int/10) return true;
        else return false;
    }
}
