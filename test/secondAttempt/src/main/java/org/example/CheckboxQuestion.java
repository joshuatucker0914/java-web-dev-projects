package org.example;
import java.util.List;

public class CheckboxQuestion extends Question {
    private List<String> options; // List of possible choices
    private List<Integer> correctOptionIndices; // Indices of the correct choices

    // Constructor
    public CheckboxQuestion(String text, List<String> options, List<Integer> correctOptionIndices) {
        super(text);
        this.options = options;
        this.correctOptionIndices = correctOptionIndices;
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
        if (answers.size() == correctOptionIndices.size()) {
            for (String answer : answers) {
                int selectedOptionIndex = Integer.parseInt(answer);
                if (!correctOptionIndices.contains(selectedOptionIndex)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}