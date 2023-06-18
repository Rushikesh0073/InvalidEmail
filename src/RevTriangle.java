public class RevTriangle {
    public static void main(String[] args) {


         int i, j;
        for (i = 1; i <= 8; i++) {  // row
        for (j = 8; j >i; j--) {   // column
            System.out.print(" *");
        }

        System.out.println();
    }
}
}



