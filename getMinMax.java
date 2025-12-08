class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] < minimum){
                minimum =arr[i];
            }
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(minimum);
        res.add(maximum);
        return res;
        
    }
}
