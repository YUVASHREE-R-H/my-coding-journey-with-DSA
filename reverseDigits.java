// You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.
// Input: n = 12020
// Output: 2201
// Explanation: By reversing the digits of number, number will change into 221.
// Input : n = 200
// Output: 2
// Explanation: By reversing the digits of number, number will change into 2.
// note : The leading zeros will disappear naturally, because integers don’t store them.

class Solution {
    public int reverseDigits(int n) {
        int rev=0;
        while(n>0){
            int last =n%10;
            rev = rev*10 +last;
            n=n/10;
        }
        return rev;
        
    }
}
