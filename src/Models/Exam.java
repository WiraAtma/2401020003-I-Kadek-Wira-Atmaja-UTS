package Models;

// Subclass dari Assessment dan implementasi interface Gradable
public class Exam extends Assessment implements Gradable {
    private double score;

    public Exam(String title, double score) {
        super(title);
        this.score = score;
    }

    @Override
    public double calculateFinalScore() {
        return score;
    }

    @Override
    public String getGrade() {
        if (score >= 85) return "A";
        else if (score >= 70) return "B";
        else if (score >= 55) return "C";
        else return "D";
    }
}

