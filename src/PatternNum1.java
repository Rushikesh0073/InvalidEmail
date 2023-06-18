public class PatternNum1 {
    public static void main(String[] args) {

        int i, j;

        for (i = 1; i <= 4; i++) {  // row
            for (j = 1; j <=i; j++) {   // column
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

