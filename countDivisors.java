// Input: n = 6
// Output: 2
// Explanation: 1, 2, 3, 6 are divisors of 6 out of which 3 and 6 are divisible by 3.

class Solution {
    static int countDivisors(int n) {
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i%3==0){
                    count++;
                }
            if(i!=n/i && (n/i)%3==0) // avoid double counting. for eg; i=6 means already computed in previous if so we dont need to compute it again in second if part
            {
                count++;
            }
            }
        }
        return count;
    }
}
