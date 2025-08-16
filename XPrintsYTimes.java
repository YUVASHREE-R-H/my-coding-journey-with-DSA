//Write a program which takes two values x and y. Prints x for y number of times.

import java.util.Scanner;
class XPrintsYTimes {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    for(int i=1; i<=y;i++){
        System.out.print(x + " ");
    }
        
    }
}
