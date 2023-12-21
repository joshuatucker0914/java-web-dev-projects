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
}