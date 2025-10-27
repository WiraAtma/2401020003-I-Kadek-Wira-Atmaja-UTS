// Soal 3 - Relationship antar class (Aggregation)
package Models;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private List<Course> courses; // Aggregation: Student punya daftar Course

    public Student(String name, String studentId) {
        super(name); // Panggil constructor superclass (Person)
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void introduce() {
        System.out.println("Nama Mahasiswa " + name + " dengan NIM " + studentId);
    }

    public void showCourses() {
        System.out.println("Mata kuliah yang diambil:");
        for (Course c : courses) {
            c.displayInfo();
        }
    }
}

