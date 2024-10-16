import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int myNumber = inputScanner.nextInt();
        inputScanner.close();
        printTable(myNumber);
    }

    public static void printTable(int number) {
        for(int i=1; i<11; i++) {
            System.out.println(number * i);
        }
    }
}
