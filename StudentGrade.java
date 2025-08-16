import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int mark = sc.nextInt();
        if(mark < 0 || mark > 100){
            System.out.println("Invalid mark");
        }
        else if(mark >= 90){
            System.out.println("Grade A");
        }
        else if(mark >= 80){
            System.out.println("Grade B");
        }
        else if(mark >=60){
            System.out.println("Grade C");
        }
        else if(mark >=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
