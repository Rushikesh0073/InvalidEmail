import java.util.Scanner;

public class OneToFive {
    public static void main(String[] args) {               // one to five//


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
            System.out.println(num+1);
            int z=num;
                System.out.println(z);
            case 2:
                System.out.println(num++);
                case 3:
                    System.out.println(num++);

                    case 4:
                    System.out.println(num++);

            case 5:
                System.out.println(num++);
            case 6 :
                System.out.println(num++);
        }
    }
}
