import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the user  number :");
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
                while(num>0)
                {
                    int digit=num%10;
                    sum=sum+(digit*digit*digit);
                    num=num/10;

                }
        System.out.println("sum :"+sum);                         // ( 153 is armstrong number check )
        if(copy==sum)
        {
            System.out.println("is armstrong number");
        }else
        {
            System.out.println("is not armstrong number");
        }
    }
}
