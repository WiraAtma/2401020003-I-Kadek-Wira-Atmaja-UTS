package Models;

public class Course {
    private String courseName;
    private int credit;
    private String instructorName;

    // Constructor
    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        setCredit(credit);
        this.instructorName = instructorName;
    }

    // Getter dan Setter
    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        if (credit < 0) {
            System.out.println("Credit tidak boleh negatif. Otomatis diset ke 0.");
            this.credit = 0;
        } else {
            this.credit = credit;
        }
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Credit: " + credit + ", Instructor: " + instructorName);
    }

    // Soal 1
    //    Class adalah cetak biru (rancangan) yang mendefinisikan atribut dan perilaku.
    //    Object adalah wujud nyata dari class tersebut.
    //
    //    Contoh:
    //    Course adalah class yang punya atribut courseName, credit, dan instructorName.
    //    Sedangkan Course c1 = new Course("Java", 3, "Pak Andi"); adalah object nyata dari class Course.

    // Soal 2
    //    Tambahkan validasi di setCredit agar nilai tidak negatif (misal jika < 0 maka jadi 0).
    //    Encapsulation penting karena melindungi data, menjaga konsistensi, dan mencegah perubahan sembarangan.
}
