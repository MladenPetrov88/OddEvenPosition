import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double OddMin = Double.MAX_VALUE;
        double OddMax = Double.NEGATIVE_INFINITY;
        double OddSum = 0;
        double EvenMin = Double.MAX_VALUE;
        double EvenMax = Double.NEGATIVE_INFINITY;
        double EvenSum = 0;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                if (number > EvenMax) {
                    EvenMax = number;
                }  if (number < EvenMin) {
                    EvenMin = number;
                }
                EvenSum += number;
            } else {
                if (number > OddMax) {
                    OddMax = number;
                }  if (number < OddMin) {
                    OddMin = number;
                }
                OddSum += number;
            }
        }

        System.out.printf("OddSum = %.2f,%n", OddSum);
        if (OddMin == Double.MAX_VALUE) {
            System.out.printf("OddMin = No,%n");
        } else {
            System.out.printf("OddMin = %.2f,%n", OddMin);
        }
        if (OddMax == Double.NEGATIVE_INFINITY) {
            System.out.printf("OddMax = No,%n");
        } else {
            System.out.printf("OddMax = %.2f,%n", OddMax);
        }
        System.out.printf("EvenSum = %.2f,%n", EvenSum);
        if (EvenMin == Double.MAX_VALUE) {
            System.out.printf("EvenMin = No,%n");
        } else {
            System.out.printf("EvenMin = %.2f,%n", EvenMin);
        }
        if (EvenMax == Double.NEGATIVE_INFINITY) {
            System.out.printf("EvenMax = No%n");
        } else {
            System.out.printf("EvenMax = %.2f", EvenMax);
        }

    }
}
