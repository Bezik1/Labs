import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        float width = inputScanner.nextFloat();
        float height = inputScanner.nextFloat();
        inputScanner.close();

        float area = rectangleArea(width, height);
        float perimeter = rectanglePerimeter(width, height);

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }

    public static float rectangleArea(float width, float height) {
        return width * height;
    }

    public static float rectanglePerimeter(float width, float height) {
        return 2*width + 2*height;
    }
}
