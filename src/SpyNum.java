import java.util.Scanner;

public class SpyNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int sum = 0;
        int product = 1;
        int lastNum;
        while (num > 0)
        {
            lastNum = num % 10;
            product = product * lastNum;
            sum = sum + lastNum;
            num = num / 10;
        }
        if (product==sum)
        {
            System.out.println("IsSPY num");
        }
        else
        {
            System.out.println("IsNOT SPY num");
        }
    }
}

