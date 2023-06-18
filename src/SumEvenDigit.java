import java.util.Scanner;

public class SumEvenDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user  number :");
        int num = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        if (num > 0) {
            int digit = num % 10;
            if (digit%2== 0)
            {
                System.out.println("Even digit " + digit);
                sum = sum + digit;
            }
            System.out.println("sum :" + sum);
        }
    }
}
