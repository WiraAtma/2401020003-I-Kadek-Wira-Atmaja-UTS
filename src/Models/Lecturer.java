package Models;

// Subclass dari Person
public class Lecturer extends Person {
    private String lecturerId;

    public Lecturer(String name, String lecturerId) {
        super(name);
        this.lecturerId = lecturerId;
    }

    @Override
    public void introduce() {
        System.out.println("Dosen bernama " + name + " dengan ID " + lecturerId);
    }
}

