package org.example;
import java.util.List;

public class Question {
    private String text; // The text of the question

    // Constructor
    public Question(String text) {
        this.text = text;
    }

    // Getter for text
    public String getText() {
        return text;
    }

    // Display the question
    public void displayQuestion() {
        System.out.println(text);
    }

    // Check if the provided answers are correct
    public boolean isCorrect(List<String> answers) {
        return false; // Base class has no specific implementation
    }

    // Multiple Choice Question
    public static class MultipleChoiceQuestion extends Question {
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

    // Checkbox Question
    public static class CheckboxQuestion extends Question {
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
                    int selectedOptionIndex = Integer.parseInt(answer) - 1;
                    if (!correctOptionIndices.contains(selectedOptionIndex)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }
    // True/False Question
    public static class TrueFalseQuestion extends Question {
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
}
