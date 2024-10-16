import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int n1 = inputScanner.nextInt();
        int d1 = inputScanner.nextInt();
        int n2 = inputScanner.nextInt();
        int d2 = inputScanner.nextInt();
        inputScanner.close();

        int[] sumOfFractions = calculateSumOfFractions(n1, d1, n2, d2);
        int[] mixedNumber = getMixedNumber(sumOfFractions);

        System.out.println("Integer part: " + mixedNumber[0] + " " + mixedNumber[1] + "/" + mixedNumber[2]);
    }

    public static int[] calculateSumOfFractions(int n1, int d1, int n2, int d2) {
        int[] result = new int[2];

        int scm = SCM(d1, d2);
        int newN = n1 * (scm/d1) + n2 * (scm/d2);

        result[0] = newN;
        result[1] = scm;

        return result;
    }

    public static int[] getMixedNumber(int[] fraction) {
        int[] mixedNumber = new int[3];

        int integer = (int)(fraction[0]/fraction[1]);
        fraction[0] = fraction[0] - integer*fraction[1];

        mixedNumber[0] = integer;
        mixedNumber[1] = fraction[0];
        mixedNumber[2] = fraction[1];

        return mixedNumber;
    }

    public static int SCM(int a, int b) {
        return a * b / GCD(a, b);
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
