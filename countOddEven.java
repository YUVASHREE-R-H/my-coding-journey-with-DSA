class Solution {
    public int[] countOddEven(int[] arr) {
        int even =0 , odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                odd+=1;
            }
            else{
                even+=1;
            }
        }
        return new int[] {odd,even};
        
    }
}
