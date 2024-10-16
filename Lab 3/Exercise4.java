import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int n = 0;
        Scanner inputScanner = new Scanner(System.in);

        while(n % 2 != 1) {
            n = inputScanner.nextInt();
            if(n % 2 == 0) System.out.print("Number must be odd!\n");
        }
        inputScanner.close();
        printTree(n);
    }

    public static void printTree(int n) {
        for(int i=0; i<n; i++) {
            int maxSpace = n*2;
            int numberOfStars = 2*i;
            int numberOfWhiteSpaces = maxSpace - numberOfStars;

            String line = "";
            for(int j=0; j<maxSpace; j++) {
                if(j<numberOfWhiteSpaces / 2) {
                    line += " ";
                } else if(j > numberOfWhiteSpaces / 2 + numberOfStars) {
                    line += " ";
                } else {
                    line += "*";
                }
            }
            System.out.println(line);
        }
    }
}
