class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        //System.out.println(grid.length + "  " + grid[0].length); 4 5
        for(int i  = 0; i< grid.length; i++){
            for(int j = 0;j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    countIsland(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void countIsland(char[][] grid, int i, int j){
        //base case check
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';
        
        countIsland(grid, i-1,j); //up
        countIsland(grid, i+1,j); //down
        countIsland(grid, i , j+1);// right
        countIsland(grid, i, j-1); // left
    }
}
