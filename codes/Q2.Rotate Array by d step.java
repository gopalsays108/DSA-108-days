class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
         /* //First solution Theta (n*d)
        //thera(1) aux space
        for(int i =0; i< d;i++){
            int temp = arr[0];
            
            for(int j = 0;j < n - 1;j++)
                arr[j] = arr[j+1];
            
            arr[n-1] = temp;
        }
        */
 //----------------------------------------------------------------------------------
 
        /*
        Second solution
        TC: Theta( d +n-d+d) => (n+d) //ignored d since it is small always
        
        TC: Theta(n)
        Space: Theta(d)
      
        if(d > n) d = d % n;
        
        int[] temp = new int[d];
        for(int i =0; i<d;i++)
            temp[i] = arr[i];
            
        for(int i =d;i<n;i++)
            arr[i-d] = arr[i];
        
        for(int i =0;i <d;i++)
            arr[n-d+i] = temp[i];
        
         */
         
//--------------------------------------------------------------------------------------

         /*
            Third Solution
            TC: Theta(n)
            Space: Theta (1) aux
         */
        if(d > n) d = d % n;
        
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        
    }
    
    static void reverse(int arr[], int low, int high){
        while(low < high){
            swap(arr, low, high);
            low++;
            high--;
        }
    }
    
    static void swap(int arr[], int start, int end ){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
