import model.Student;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {

        // creating a new student object

        Student student1 = new Student(
                21892635,
                "Wilfredo",
                "wilfredobodai5@gmail.com",
                "059 530 2008",
                "BSc Computer Science",
                "2026");

        // printing the student details
        System.out.println("Student Id: " + student1.getId());
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Email: " + student1.getEmail());
        System.out.println("Student Phone: " + student1.getPhone());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Graduation Year: " + student1.getYear());

        // Changing the student's phone number
        student1.setPhone("050 059 3722");

        // printing the new student phone
        System.out.println("New Student Phone: " + student1.getPhone());

        Student student2 = new Student(
                10327185,
                "Christabel Boadu",
                "christabel@gmail.com",
                "024 493 7234",
                "BSc Law",
                "2025");

        System.out.println("Student 2: " + student2.getName());

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        // Printing all students
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }
    }

}