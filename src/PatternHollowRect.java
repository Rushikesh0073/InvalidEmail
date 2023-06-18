public class PatternHollowRect {
    public static void main(String[] args) { // check code
        int l=4;
        int m=5;
        int space;
        for (int i=1;i<=l;i++)// row
        {
            for(int j=1;j<=m;j++)
            {
                if (i==1||j==1||i==l||j==l)
                {
                    System.out.print(" *");
                }
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
