import java.util.Scanner;
class isTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angles : ");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c == 180){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot be formed");
        }
    }
}
