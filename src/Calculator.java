import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
                int num1=sc.nextInt();
        System.out.println("Enter second number :");
                int num2=sc.nextInt();
        System.out.println("Enter choice : 1 Addition :  2 subtraction : 3 multiplication: 4 division");
                int ch=sc.nextInt();

                switch(ch)
                {
                    case 1:
                        System.out.println("Addition :"+(num1+num2));
                    case 2:
                        System.out.println("Subtract"+(num1-num2));
                    case 3:
                        System.out.println("Multiply"+(num1*num2));
                    case 4:
                        System.out.println("Division"+(num1/num2));
                    case 5:
                        System.out.println("mod to get remainder"+(num1%num2));

                }
    }
}
