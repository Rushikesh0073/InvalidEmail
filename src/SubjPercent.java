import java.util.Scanner;

public class SubjPercent {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of three subj");
        int sub1= sc.nextInt();
        System.out.println(" marks of marathi:"+sub1);
        int sub2=sc.nextInt();
        System.out.println("marks of english:"+sub2);
        int sub3=sc.nextInt();
        System.out.println("marks of math:"+sub3);

        int sum=sub1+sub2+sub3;
        System.out.println("sum of all subject :"+sum);

        int percentage= (sum/3)*100;
        System.out.println("percentage of sub: "+percentage);
    }
}
