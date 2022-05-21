//https://leetcode.com/problems/hand-of-straights/
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //Treemap coz  it stores order
        TreeMap<Integer, Integer> card_count = new TreeMap<>();
        
        for(int card: hand){
            int freq = card_count.getOrDefault(card, 0) + 1;
            card_count.put(card, freq);
        }
        
        while(card_count.size() > 0){
            int key = card_count.firstKey();
            for(int i  = key; i< key + groupSize; i++){
                if(!card_count.containsKey(i)) return false;
                int count  = card_count.get(i);
                if(count == 1) card_count.remove(i);
                else card_count.replace(i, count -1);
            }
        }
        
        return true;
    }
}
