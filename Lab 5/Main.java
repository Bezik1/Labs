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

class PersonExerciseThree {
    private String name;
    private int age;
    private boolean gender;
    private int yearOfBirth;

    private int currentYear = 2024;

    public PersonExerciseThree() {}

    public PersonExerciseThree(String name, int yearOfBirth, boolean gender) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.age = currentYear - yearOfBirth;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.print("Name: " + name +" ");
        System.out.print("Year Of Birth: " + yearOfBirth + " ");
        System.out.print("Age: " + age + " ");
        System.out.print("Gender: " + (gender ? "Male" : "Female") + "\n");
    }

    // Getters
    public int getYearOfBirth() {
        return yearOfBirth;
    }

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
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.age = currentYear - yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {}

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount < 0) { System.err.println("Amount must be positive!"); return; }

        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount < 0) { System.err.println("Withdrawal amount must be positive!"); return; }
        if(this.balance < amount) { System.err.println("There is no enough money!"); return; }

        this.balance -= amount;
    }

    // Setter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
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
            case 3:
                exerciseThree();
            case 4:
                exerciseFour();
            default:
                break;
        }
    }

    public static void exerciseFour() {
        BankAccount bankAccountOne = new BankAccount("0xffffff", 100.0);
        BankAccount bankAccountTwo = new BankAccount("0x000000", 50.0);

        System.out.println("BankAccountOne Balance: " + bankAccountOne.getBalance());
        System.out.println("BankAccountOne Balance: " + bankAccountTwo.getBalance());

        bankAccountOne.withdraw(12.0);
        bankAccountTwo.withdraw(40.0);

        System.out.println("BankAccountOne Balance: " + bankAccountOne.getBalance());
        System.out.println("BankAccountOne Balance: " + bankAccountTwo.getBalance());

        bankAccountOne.withdraw(-12.0);
        bankAccountTwo.withdraw(40.0);

        System.out.println("BankAccountOne Balance: " + bankAccountOne.getBalance());
        System.out.println("BankAccountOne Balance: " + bankAccountTwo.getBalance());

        bankAccountOne.deposit(12.0);
        bankAccountTwo.deposit(40.0);

        System.out.println("BankAccountOne Balance: " + bankAccountOne.getBalance());
        System.out.println("BankAccountOne Balance: " + bankAccountTwo.getBalance());

        bankAccountOne.deposit(-12.0);
        bankAccountTwo.deposit(40.0);
    }

    public static void exerciseThree() {
        PersonExerciseThree person = new PersonExerciseThree("Mateusz", 2006, true);
        person.displayInfo();

        person.setYearOfBirth(2005);
        person.displayInfo();
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
