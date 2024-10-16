import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        inputScanner.close();

        int[] fraction = { a, b };
        int[] mixedNumber = getMixedNumber(fraction);

        System.out.println("Integer part: " + mixedNumber[0] + " " + mixedNumber[1] + "/" + mixedNumber[2]);
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

    public static int GCD(int a, int b) {
        while(b > 0) {
            int pom = a;
            a = b;
            b = pom % b;
        }
        return a;
    }
}
