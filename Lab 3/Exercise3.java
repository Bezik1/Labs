import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        inputScanner.close();

        System.out.println("GCD: " + GCD(a, b));
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
