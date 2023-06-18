import java.util.Scanner;
public class IfElse1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  percentage");
        int percent= sc.nextInt();
        System.out.println("Percentage is: "+percent);
        System.out.println("Enter final year of graduation");
         int passyear=sc.nextInt();

         if (percent>=60 && passyear>=2021)
         {
             System.out.println("Student is eligible for exam");
         } else
         {
             System.out.println("Student is eligible for exam");
         }
    }
}
