public class FrequencyDigit {
        public static void main(String[] args) {
            int number = 1234555;
        int cnt=0;

            // Count the frequency of each digit
            while (number != 0) {
                int digit = number % 10;
               cnt++;
                number /= 10;
            }

            // Print the frequency of each digit
            for (int i = 0; i < 10; i++) {
                if (cnt > 0) {
                    System.out.println("Frequency of digit " + i + ": " +cnt);
                }
            }
        }
    }