import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();
        inputScanner.close();
        printPyramid(n);

    }
    public static void printPyramid(int n) {
        for(int i=1; i<n+1; i++) {
            String stars = "";
            for(int j=0; j<i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
