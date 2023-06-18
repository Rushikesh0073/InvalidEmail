public class TableOfNum {
        public static void main(String[] args) {
            int rows = 5;//  table count 1  to 5 table
            int columns = 10;

            System.out.print("    ");
            for (int i = 1; i <= columns; i++) {
                System.out.println(i);
            }
            System.out.println();

            for (int i = 1; i <= rows; i++) {
                System.out.println(i);
                for (int j = 1; j <= columns; j++) {
                    System.out.println(i * j);
                }
                System.out.println();
            }
        }
    }

