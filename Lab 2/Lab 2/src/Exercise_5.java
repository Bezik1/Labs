import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();
        inputScanner.close();

        printReversedPyramid(n);
    }

    public static void printReversedPyramid(int n) {
        for(int i=0; i<n; i++) {
            String stars = "";
            for(int j=0; j<n-i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
