//https://leetcode.com/problems/valid-palindrome/submissions/
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)) str += ch;
        }
        
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;
    }
}
/*
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
}

*/
