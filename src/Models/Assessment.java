package Models;

// Soal 5 - Abstract Class
public abstract class Assessment {
    public String title;

    public Assessment(String title) {
        this.title = title;
    }

    // Abstract
    public abstract double calculateFinalScore();
}

