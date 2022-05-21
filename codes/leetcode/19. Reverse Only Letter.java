//https://leetcode.com/problems/reverse-only-letters/
class Solution {
    public String reverseOnlyLetters(String s) {
        // Can also use stack. because of property first in last out
        
        int start = 0;
        int end = s.length() - 1;
        
        char[] ch = s.toCharArray();
        
        while(start < end){
            if(Character.isLetter(ch[start])){
                if(Character.isLetter(ch[end])){
                    char temp = ch[start];
                    ch[start] = ch[end];
                    ch[end] = temp;
                    start++;
                    end--;
                }else{
                    end--;
                }
            }else{
                start++;
            }
        }
        
        return new String(ch);
    }
}
