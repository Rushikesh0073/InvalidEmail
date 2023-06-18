public class PrimeAvgNUMnew {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int sum = 0;
        int count = 0;

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println("numbers" + num);

            if (isPrime==true) {
                sum = sum + num;
                count++;
            }
        }
                System.out.println(count);
                System.out.println("Sum is " + sum);

                double avg = (double)sum / count;
                System.out.println("Avg :" +avg);
            }
        }
