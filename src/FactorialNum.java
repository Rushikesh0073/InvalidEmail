import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user number: ");
            int num1 = sc.nextInt();
            int sum = 0;
            while (num1 > 0) {
                int digit = num1 % 10;// num out 12 ->3
                int fact = 1;
                for (int i = 1; i <= digit; i++)// digit entering
                {
                    fact = fact * i;
                }
                sum = sum + fact;
                num1 = num1 / 10;
            }
            System.out.println(sum);
           /* if(num1==sum)
            {
                System.out.println("Arishmati");
            }else {
                System.out.println("not arishmati");
            }*/
        }
    }


