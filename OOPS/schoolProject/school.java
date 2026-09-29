package schoolProject;

class student {
    String name;
    int age;
    String grade;

    public student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class school {
    
    public static void main(String[] args) {
        student student1 = new student("Alice", 15, "10th Grade");
        student student2 = new student("Bob", 16, "11th Grade");

        System.out.println("Student 1 Information:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();
    }
    
}
