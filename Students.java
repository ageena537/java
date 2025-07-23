package ageena;

public class Students{
   String name;
    int age;
 public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
   
        Students student1 = new Students();

        student1.name = "Alice";
        student1.age = 20;

        student1.displayDetails();
    }
}