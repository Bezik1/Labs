public class Exercise_2 {
    public static void main(String[] args) {

        float width = 5.05f;
        float height = 7.5f;

        float rectangleArea = getRectangleArea(width, height);
        float rectanglePerimeter = getRectanglePerimeter(width, height);

        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
    }

    public static float getRectangleArea(float width, float height) {
        return width * height;
    }

    public static float getRectanglePerimeter(float width, float height) {
        return (2 * width) + (2 * height);
    }
}
