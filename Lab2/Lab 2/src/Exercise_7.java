import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();
        int m = inputScanner.nextInt();
        inputScanner.close();

        printRectangle(n, m);
    }

    public static void printRectangle(int n, int m) {
        for(int i=0; i<n; i++) {
            String line = "";
            for(int j=0; j<m; j++) {
                if(j == 0 || j == m-1) {
                    line += "*";
                } else if(i == 0 || i == n-1) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            System.out.println(line);
        }
    }
}
