import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the user number ");
        int num=sc.nextInt();
         int rev=0;
         int cnt=0;
         while(num>0)
         {
             rev=rev*10+num%10;
             num=num/10;
             cnt++;
         }
        System.out.println(rev);
        System.out.println("reverse number is "+rev);
        System.out.println("count is "+cnt);
    }
}
