class Solution {
    public boolean judgeCircle(String moves) {
        int posH = 0;
        int posV = 0;
        for(char ch: moves.toCharArray()){
            if(ch == 'U') posV++;
            else if(ch == 'D') posV--;
            else if(ch == 'R') posH++;
            else posH--;
        }
        
        return (posH == 0 && posV == 0);

    }
}
