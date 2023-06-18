import java.util.Scanner;

public class MenuDrivAreaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float pi = (float) 3.14;
        System.out.println("Enter  user radius");
        int radius = sc.nextInt();
        System.out.println("Enter choice");
        char ch1;
        do {
            int ch = sc.nextInt();
            System.out.println("Enter the choice");

            System.out.println("Enter number l:");
            int l = sc.nextInt();
            System.out.println("Enter number b:");
            int b = sc.nextInt();
            System.out.println("Enter number h:");
            int h = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Area of Circle  :" + (2 * pi * (radius * radius)));
                case 2:
                    System.out.println("Area of Triangle "+(l * b * h));
            }
            System.out.println("do you want contine....press Y or y");

            ch1 = sc.next().charAt(0);
        }
        while (ch1 == 'y' || ch1 == 'Y');
        System.out.println();
    }
}

