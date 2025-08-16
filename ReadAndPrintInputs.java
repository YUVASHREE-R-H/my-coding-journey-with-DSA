import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        sc.nextLine(); //consume the leftover newline
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println(num1);
        System.out.println(name);
        System.out.println(ch);
    }
}
