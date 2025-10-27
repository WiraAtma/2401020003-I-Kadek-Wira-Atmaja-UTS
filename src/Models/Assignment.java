package Models;

// Subclass lain dari Assessment dan implementasi interface Gradable
public class Assignment extends Assessment implements Gradable {
    private double completion;

    public Assignment(String title, double completion) {
        super(title);
        this.completion = completion;
    }

    @Override
    public double calculateFinalScore() {
        return completion * 100; // completion antara 0.0–1.0
    }

    @Override
    public String getGrade() {
        double score = calculateFinalScore();
        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 60) return "C";
        else return "D";
    }
}

