import java.util.Scanner;
public class AlphaDigitSymbol{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        /*if (ch=='A'|| ch=='B'|| ch=='C'||ch=='D'||ch=='E'||ch=='F'|| ch=='H'|| ch=='I'||ch=='J'||ch=='K'||ch=='L'|| ch=='M'|| ch=='N'||ch=='O'||ch=='P'
        ||ch=='R'|| ch=='S'|| ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z'|| ch>='a' &&ch<='z')
        {
            System.out.println("Given character is Alpha ");

        }else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
        {
            System.out.println("Given chara is number");
        }else
            System.out.println("special Chara chara");
        }
    }
    */
             if(ch>='a'&& ch<'z' ||  ch>='A' && ch<='Z')
             {
             System.out.println("is Alpha");
             }else if(ch>='0'&&ch<='9')
             { System.out.println("is digit");
             }else
             {
             System.out.println("Special Chara");
             }
             }
             }





