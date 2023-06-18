import java.util.Scanner;

public class AvgPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        boolean isPrime = true;
        //for (int i = 2; i < num; i++) {
        if (num % 2 == 0) {
            isPrime = false;
        }
        if (isPrime == true) {
            System.out.println("prime" + num);
            int digit = num % 10;
            sum = sum + digit;
            cnt++;
            System.out.println();
            num = num / 10;
            System.out.println("sum:" + sum);
            System.out.println("count:" + cnt);
            int mAvg = sum / cnt;
            System.out.println("average:" + mAvg);
        }
    }
}



