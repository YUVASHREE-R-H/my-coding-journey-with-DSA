//Write a program to take x and print multiples of x till 1000.

import java.util.Scanner;
class XMultiples{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x = sc.nextInt();
    for(int i=x; i<=1000;i=i+x){
        System.out.print(i + " ");
    }
        
    }
}
