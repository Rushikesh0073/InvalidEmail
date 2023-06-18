import java.util.Scanner;

public class LessThanGreterThan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2 ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3 ");
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("number1 is greater" + num1);
            } else if (num2 > num1) {
                System.out.println("number2 is greater" + num2);
            }
        } else if (num2 > num3) {
            System.out.println("number2 is greater" + num2);
        } else {
            System.out.println("number3 is greater " + num3);
        }
    }
}

