import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        inputScanner.close();

        int[] reducedFraction = reduceFraction(a, b);
        System.out.println(a + "/" + b + " = " + reducedFraction[0] + "/" + reducedFraction[1]);
    }

    public static int[] reduceFraction(int a, int b) {
        int[] reducedFraction = new int[2];

        int gcd = GCD(a, b);

        reducedFraction[0] = a / gcd;
        reducedFraction[1] = b /gcd;

        return reducedFraction;
    }

    public static int GCD(int a, int b) {
        while(b > 0) {
            int pom = a;
            a = b;
            b = pom % b;
        }
        return a;
    }
}
