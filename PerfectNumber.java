// A positive integer that is equal to the sum of its proper divisors (divisors excluding itself).
// Example: 6
// 6: divisors are 1,2,3,6
// Proper divisors =1+2+3=6.

import java.util.*;
class PerfectNumber {
    public static void main(String[] args) {
        int n=28;
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(n/i!=i){
                    sum+=(n/i);
                }
            }
        }
        if(sum==n){
            System.out.println("perfect number");
        }
        else{
           System.out.println("not a perfect number"); 
        }
    }
}
