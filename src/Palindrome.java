import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user number :");
        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;
        while (num > 0)
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
        if (org_num == rev)
        {
            System.out.println("number is palindrome");
        }else
        {
            System.out.println("number is not palindrome");

        }
    }
}








