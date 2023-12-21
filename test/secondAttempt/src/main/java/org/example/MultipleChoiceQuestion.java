package org.example;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> options; // List of possible choices
    private int correctOptionIndex; // Index of the correct choice

    // Constructor
    public MultipleChoiceQuestion(String text, List<String> options, int correctOptionIndex) {
        super(text);
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    // Display the question with options
    @Override
    public void displayQuestion() {
        super.displayQuestion();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    // Check if the provided answers are correct
    @Override
    public boolean isCorrect(List<String> answers) {
        if (answers.size() == 1) {
            int selectedOptionIndex = Integer.parseInt(answers.get(0)) - 1;
            return selectedOptionIndex == correctOptionIndex;
        }
        return false;
    }
}