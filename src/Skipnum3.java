
public class Skipnum3{
    public static void main(String[] args)
    {
        int num=30;
        int cnt=0;
        for(int i=0;i<=30;i++)
        {
            if(i%3==0)
            {
                continue;

            }
            cnt++;
            System.out.println(i);
        }

    }
}
