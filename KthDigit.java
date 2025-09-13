// Input: a = 3, b = 3, k = 1
// Output: 7
// Explanation: 33 = 27 and 1st digit from right is 7

class Solution {
    static long KthDigit(int a, int b, int k) {
        long n=(long)Math.pow(a,b);
        int count =0;
        while(n>0){
            count =count+1;
            if(count==k){
                n=n%10;
                break;
            }
            n=n/10;
        }
        return n;
    }
}
