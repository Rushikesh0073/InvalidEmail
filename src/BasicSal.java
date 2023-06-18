import java.util.Scanner;

public class BasicSal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Basic Sal:");
        int Basicsal=sc.nextInt();
        System.out.println("BasicSal is:"+Basicsal);

        double pf=Basicsal*0.1;
        System.out.println("PF is "+pf);

        double da=Basicsal*1.5;
        System.out.println("DA is "+da);

        double hra=Basicsal*2.0;
        System.out.println("HRA:"+hra);

        double netsal=Basicsal+pf+da+hra-(Basicsal*0.02);
        System.out.println("NetSal is "+netsal);

    }
}
