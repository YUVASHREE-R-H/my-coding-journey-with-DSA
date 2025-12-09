class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    
    public long findMultiplication(int[] arr1, int[] arr2) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] > maximum){
                maximum = arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if( arr2[i] <minimum){
                minimum =arr2[i];
            }
        }
        return (long) maximum*minimum;
        
        
    }
}
