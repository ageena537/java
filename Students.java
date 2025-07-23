package ageena;
import java.util.Scanner;
public class Students{
    // Data members
    String name;
    int age;

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Students student1 = new Students();

        System.out.print("Enter student name: ");
        student1.name = scanner.nextLine();

        System.out.print("Enter student age: ");
        student1.age = scanner.nextInt();

        System.out.println("\nStudent Details:");
        student1.displayDetails();

        scanner.close();
    }
}