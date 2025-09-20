
// Given a number N.Find the sum of fifth powers of natural numbers till N i.e. 15+25+35+..+N5.
// Input:N=2
// Output:33
// Explanation:The sum is calculated as 15+25=1+32=33.

class Solution {
    long sumOfFifthPowers(long N) {
        return ((N*N*(N+1)*(N+1)*(2*N*N +2*N-1))/12);
        
    }
}
