class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if(numRows == 0) return triangle;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        
        for(int i = 1; i< numRows; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> next = new ArrayList<>();
            next.add(1); //first number is always one
            
            for(int j = 1;j < i;j++){ // kyunki har row mien row jitne hi element hai
                next.add(prev_row.get(j-1) + prev_row.get(j));
            }
            
            next.add(1); // last term
            triangle.add(next);
        }
        return triangle;
    }
}
