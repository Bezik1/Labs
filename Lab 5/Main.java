import java.util.Scanner;

class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(float param) {
        this.width = param;
        this.height = param;
    }

    public float getArea() {
        return this.width * this.height;
    }

    public float getPermiter() {
        return (2 * this.width) + (2 * this.height);
    }

    // Getters
    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    // Setters
    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

class Person {
    private String name;
    private int age;
    private boolean gender;

    public Person() {}

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.print("Name: " + name +" ");
        System.out.print("Age: " + age + " ");
        System.out.print("Gender: " + (gender ? "Male" : "Female") + "\n");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int exerciseIndex = inputScanner.nextInt();
        inputScanner.close();

        switch (exerciseIndex) {
            case 1:
                exerciseOne();
                break;
            case 2:
                exerciseTwo();
            default:
                break;
        }
    }

    public static void exerciseOne() {
        Person personOne = new Person("Mateusz", 19, true);
        Person personTwo = new Person("Iwona", 19, false);
        Person personThree = new Person("Przemek", 19, true);

        personOne.displayInfo();
        personTwo.displayInfo();
        personThree.displayInfo();
    }

    public static void exerciseTwo() {
        Rectangle rectOne = new Rectangle(1);
        Rectangle rectTwo = new Rectangle(2);
        Rectangle rectThree = new Rectangle(3);

        printRectangleInfo(rectOne);
        printRectangleInfo(rectTwo);
        printRectangleInfo(rectThree);
    }

    public static void printRectangleInfo(Rectangle rect) {
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPermiter());
    }
}
