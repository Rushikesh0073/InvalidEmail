import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =10;
        int ch= sc.nextInt();
        switch (ch)
        {
            case 1:
            System.out.println("even: "+(num%2==0));
            case 2:
                System.out.println("odd: "+(num%2!=0));
        }

       /* if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }*/
    }
}
