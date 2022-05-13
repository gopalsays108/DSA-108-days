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

/*Stack Solution*/
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        
        
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#'){
                if(!st2.isEmpty()) st2.pop();
            }else{
                st2.push(t.charAt(i));
            }
        } 
        System.out.println(st + "  " + st2);
        StringBuilder sb = new StringBuilder();
        
        StringBuilder sb2 = new StringBuilder();
        
        
        while(!st2.isEmpty()){
                sb2.append(st2.pop());
        }
        
        
        while(!st.isEmpty()){
                sb.append(st.pop());
        }
        System.out.println(sb + " " + sb2);
        return sb.toString().equals( sb2.toString());
        
    }
}

