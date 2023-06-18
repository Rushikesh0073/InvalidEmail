import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1;
        do {
            System.out.println("Enter number 1:");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            int num2 = sc.nextInt();
            System.out.println("Enter the choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Add :" + (num1 + num2));
                case 2:
                    System.out.println("sub :" + (num1 - num2));
                case 3:
                    System.out.println("mul :" + (num1 * num2));
                case 4:
                    System.out.println("div: " + (num1 / num2));
                case 5:
                    System.out.println("mod: " + (num1 % num2));
                default:
                    System.out.println("invalid");
            }
            System.out.println("do you want contine....press Y or y");

             ch1 = sc.next().charAt(0);
        }
        while(ch1 == 'y' || ch1 == 'Y');
        System.out.println();
        }
    }





