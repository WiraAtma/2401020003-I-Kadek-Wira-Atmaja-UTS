import Models.*;

public class Main {
    public static void main(String[] args) {
        // Soal 1 dan 2 - Class, Object, Encapsulation
        Course c1 = new Course("PBO", 3, "Pak Aziz");
        Course c2 = new Course("Kecerdasan Buatan", -2, "Pak Komang"); // credit negatif di tes
        c1.displayInfo();
        c2.displayInfo();

        // Soal 3 - Aggregation
        Student s1 = new Student("Wira", "0003");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.introduce();
        s1.showCourses();

        // Soal 4 - Inheritance & Polymorphism
        Person[] people = {
                new Student("Bayu", "0004"),
                new Lecturer("Ivan", "0005")
        };
        System.out.println("\nPolymorphism:");
        for (Person p : people) {
            p.introduce(); // polymorphism: method sama, perilaku berbeda
        }

        // Soal 5 - Abstract Class & Interface
        // Abstract Class: Gunakan saat membuat template untuk class yang berhubungan (relasi "is-a") & Anda ingin berbagi kode (atribut/method).
        // Interface: Gunakan saat mendefinisikan kontrak atau "kemampuan" (relasi "can-do") yang bisa dimiliki oleh class yang tidak berhubungan sekalipun.
        Exam exam = new Exam("UTS PBO", 88);
        Assignment tugas = new Assignment("Tugas Code UTS Pak Aziz", 0.8);

        System.out.println("\nNilai Akhir:");
        System.out.println(exam.title + " = " + exam.calculateFinalScore() + " (" + exam.getGrade() + ")");
        System.out.println(tugas.title + " = " + tugas.calculateFinalScore() + " (" + tugas.getGrade() + ")");
    }
}
