// Input: n = 555
// Output: true
// Explanation: The number 555 reads the same backward as forward, so it is a palindrome.

class Solution {
    public boolean isPalindrome(int n) {
        int original =n;
        int rev=0;
        while(n>0){
            int last_digit = n%10;
            rev = rev*10 + last_digit;
            n/=10;
        }
        if(rev == original){
            return true;
        }
        else{
            return false;
        }
        
    }
}
