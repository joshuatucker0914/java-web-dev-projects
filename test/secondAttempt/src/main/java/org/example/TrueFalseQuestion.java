package org.example;
import java.util.List;

public class TrueFalseQuestion extends Question {
    private boolean correctAnswer; // The correct answer (true or false)

    // Constructor
    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    // Check if the provided answers are correct
    @Override
    public boolean isCorrect(List<String> answers) {
        if (answers.size() == 1) {
            return Boolean.parseBoolean(answers.get(0)) == correctAnswer;
        }
        return false;
    }
}