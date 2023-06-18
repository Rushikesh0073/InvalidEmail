import java.util.Scanner;

public class AvgOFOdd {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        int avg=0;
        int count=0;
        if(num%2!=0)
        {
            int digit=num%10;
         sum=sum+num;
         num=num/10;
         count++;
        }
        System.out.println(count);
        int avgN=sum/count;
        System.out.println(avgN);
    }
}
