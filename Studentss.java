package ageena;

public class Student1 {
String name;
    static int studentCount = 0;

    
    Student1(String name) {
        this.name = name;
        studentCount++;
    }
    public void getStudentDetails() {
        System.out.println("Name: " + name);
    }


    public static int getStudentCount() {
        return studentCount;
    }
}

public class Studentss {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Alice");
        Student1 student2 = new Student1("Bob");
        Student1 student3 = new Student1("Charlie");

       
        student1.getStudentDetails();
        student2.getStudentDetails();
        student3.getStudentDetails();

      
        System.out.println("Total number of students: " + Student1.getStudentCount());
    }
}
