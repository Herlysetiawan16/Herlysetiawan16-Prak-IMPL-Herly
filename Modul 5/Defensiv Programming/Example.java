import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int age = 14;
        assert age <= 18 : "Cannot Vote";  // Assertion untuk memastikan age <= 18
        System.out.println("The voter's age is " + age);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur age: ");
        int value = scanner.nextInt();
        assert value >= 18 : "Not valid";  // Assertion untuk memastikan value >= 18
        System.out.println("value is " + value);
    }
}
