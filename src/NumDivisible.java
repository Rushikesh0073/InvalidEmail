import java.util.Scanner;

public class NumDivisible {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter user  number ");
        int num = sc.nextInt();

        if (num%5==0)
        {
            System.out.println("Num is divisible by 5");

            if(num%11==0)
            {
                System.out.println("Num is divisible by 11");
            }else
            {
                System.out.println("not divisible by 11");
                System.out.println("  another condition invalid ");
            }
        }else
        {
            System.out.println("not divisible by 5");
        }
       /* if (num%5==0 && num %11==0)
        {
            System.out.println(" This Number is divisible by 5 And 11: "+ num);
        }else
        {
            System.out.println(" This Number is not  divisible by 5 And 11"+ num);
        }*/
    }
}
