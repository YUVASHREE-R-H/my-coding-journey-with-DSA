// Write a program that gets n as input and print the reverse of the number

// Input : 325345

// Expected output: 543523

import java.util.*;
class ReverseNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        while(n>0){
            int last_digit=n%10;
            rev = rev*10 +last_digit;
            n/=10;
        }
        System.out.println(rev);
    }
}
