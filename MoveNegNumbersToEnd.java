/*Examples:
Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.
Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
Output : [7, 9, 10, 11, -5, -3, -4, -1] */

class Solution {
    public void segregateElements(int[] arr) {
        int[] temp = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                temp[j]=arr[i];
                j++;
            }
        }
        System.arraycopy(temp,0,arr,0,arr.length);
    }
}
