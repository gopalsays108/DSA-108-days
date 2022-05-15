// https://leetcode.com/problems/keys-and-rooms/
class Solution {
    //this one is faster
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] isSeen = new boolean[rooms.size()];
        isSeen[0] = true;
        
        Set<Integer> set = new HashSet<>();
            
        Stack<Integer> keys = new Stack<>();
        keys.add(0);
        
        while(!keys.isEmpty()){
            int key = keys.pop();
            for(int curr: rooms.get(key)){
                if(!isSeen[curr]){
                    isSeen[curr] = true;
                    keys.add(curr);
                }
            }
        }
        
        for(boolean is: isSeen){
            if(!is) return false;
        }
        
        return true;
    }
}
/*
public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> dfs = new Stack<>(); dfs.add(0);
        HashSet<Integer> seen = new HashSet<Integer>(); seen.add(0);
        while (!dfs.isEmpty()) {
            int i = dfs.pop();
            for (int j : rooms.get(i))
                if (!seen.contains(j)) {
                    dfs.add(j);
                    seen.add(j);
                    if (rooms.size() == seen.size()) return true;
                }
        }
        return rooms.size() == seen.size();
    }
*/
