import java.util.Scanner;

public class DayNumUser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day number");
        int dayNum= sc.nextInt();
        if(dayNum==1)
        {
            System.out.println("sunday");
        } else if (dayNum==2)
        {
            System.out.println("monday");

        } else if (dayNum==3)
        {
            System.out.println("Tue");
        }
        else if (dayNum==4)
        {
            System.out.println("Wed");
        } else if (dayNum==5)
        {
            System.out.println("thur");
        }
        else if (dayNum==6)
        {
            System.out.println("fri");
        }else if (dayNum==7)
        {
            System.out.println("sat");
        }
    }
}
