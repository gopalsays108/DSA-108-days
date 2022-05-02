class Solution {
    
    /*
     Time Compelexity: O(n)
     Space Complexity = O(1)
     
    */
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count = 0;
        for(int i = 0; i<n;i++){
            if(arr[i] != 0)
                swap(arr,count++,i);
        }
    }
    
    void swap(int[] arr, int count, int i){
        int temp = arr[count];
        arr[count] = arr[i];
        arr[i] = temp;
    }
}
