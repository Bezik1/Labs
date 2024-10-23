public class Exercise_6 {
    public static void main(String[] args) {
        float pi = 3.14f;
        float r = 3f;

        float circleArea = getCircleArea(pi, r);
        float circlePerimeter = getCirclePerimeter(pi, r);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);
    }

    public static float getCircleArea(float pi, float r) {
        return pi * r * r;
    }

    public static float getCirclePerimeter(float pi, float r) {
        return 2 * pi * r;
    }
}
