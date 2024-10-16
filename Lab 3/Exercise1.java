import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("What's your name?");

        Scanner inputScanner = new Scanner(System.in);
        String name = inputScanner.nextLine();

        inputScanner.close();

        System.out.println("Hello " + name);
    }
}
