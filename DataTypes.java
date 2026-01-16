import java.util.Scanner;

public class DataTypes {

    // ---------- Static Variable ----------
    static String applicationName = "Java Data Types Demo";

    // ---------- Instance Variable ----------
    int instanceCounter = 1;

    public static void main(String[] args) {

        // ---------- Local Variables ----------
        byte age = 25;                 
        short year = 2026;             
        int salary = 50000;            
        long population = 1400000000L; 

        float rating = 4.5f;           
        double pi = 3.14159265359;   

        char grade = 'A';              
        boolean isJavaFun = true;       

        // ---------- Printing Primitive Values ----------
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Age (byte): " + age);
        System.out.println("Year (short): " + year);
        System.out.println("Salary (int): " + salary);
        System.out.println("Population (long): " + population);
        System.out.println("Rating (float): " + rating);
        System.out.println("Pi (double): " + pi);
        System.out.println("Grade (char): " + grade);
        System.out.println("Java is fun: " + isJavaFun);

        // ---------- Scanner for User Input ----------
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== User Input Section ===");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // ---------- Arithmetic Operations ----------
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        double division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2; // explicit type casting
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // ---------- Formatted Output ----------
        System.out.printf("\nSum: %d", sum);
        System.out.printf("\nDifference: %d", difference);
        System.out.printf("\nProduct: %d", product);
        System.out.printf("\nDivision: %.2f\n", division);

        // ---------- Type Casting ----------
        System.out.println("\n=== Type Casting ===");

        // Implicit Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue;
        System.out.println("Implicit Casting (int → double): " + doubleValue);

        // Explicit Casting (Narrowing)
        double salaryDouble = 45678.99;
        int salaryInt = (int) salaryDouble;
        System.out.println("Explicit Casting (double → int): " + salaryInt);

        // ---------- Instance Variable Access ----------
        DataTypes obj = new DataTypes();
        System.out.println("\nInstance Counter: " + obj.instanceCounter);

        // ---------- Static Variable Access ----------
        System.out.println("Application Name: " + applicationName);

        sc.close();
    }
}
