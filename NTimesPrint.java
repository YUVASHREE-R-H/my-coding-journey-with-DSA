//Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

import java.util.Scanner;
class NTimesPrint{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter first name: ");
    String first = sc.nextLine();
    System.out.print("Enter last name: ");
    String last = sc.nextLine();
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    for(int i=1; i<=n;i++){
        System.out.println(first + last);
    }
        
    }
}
