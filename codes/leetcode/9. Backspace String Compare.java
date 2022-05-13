class Solution {
    public boolean backspaceCompare(String s, String t) {
        int s_pointer = s.length() - 1;
        int t_pointer = t.length() - 1;
        
        int skipS = 0;
        int skipT = 0;
        
        while(s_pointer >= 0 || t_pointer >= 0){
            
            while(s_pointer >= 0){
                if(s.charAt(s_pointer) == '#'){
                    skipS++;
                    s_pointer--;
                }else if(skipS > 0){
                    s_pointer--;
                    skipS--;
                }else{
                    break;
                }
            }            
            
            while(t_pointer >= 0){
                if(t.charAt(t_pointer) == '#'){
                    skipT++;
                    t_pointer--;
                }else if(skipT > 0){
                    t_pointer--;
                    skipT--;
                }else{
                    break;
                }
            }
            
            if(s_pointer >= 0 && t_pointer>= 0 && s.charAt(s_pointer) != t.charAt(t_pointer)){
                return false;
            }
            
            if((s_pointer >= 0) != (t_pointer>=0)){
                return false;
            }
            
            s_pointer--;
            t_pointer--;
            
        }
        return true;
    }
}
