import java.util.Scanner;

public class AverageNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int rev = 0;
        int sum = 0;
        int avg=0;

       /* while(num>0)
        {
            rev=rev*10+num%10;                     //   Sum and Average of Number
            num=num/10;
        }
        System.out.println(rev);
    }/*
        */
      int  cnt=0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            cnt++;
            System.out.println();
            num = num / 10;
        }
        System.out.println("sum:"+sum);
        System.out.println("count:"+cnt);
        int mAvg=sum/cnt;
        System.out.println("average:"+mAvg);
    }
}
