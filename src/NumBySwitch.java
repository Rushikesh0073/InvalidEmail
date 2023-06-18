import java.util.Scanner;

public class NumBySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user number: ");
        int num = sc.nextInt();
        System.out.println("Enter choice:1");
         int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("entered number "+(num));
                num++;
                System.out.println(num);


        }
        num++;
        System.out.println(num);//     try to print 1 to 5 number using switch??prblm
    }

}
