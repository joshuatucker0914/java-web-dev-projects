package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private List<List<String>> userAnswersList; // Store user answers for each question

    // Constructor
    public Quiz() {
        this.questions = new ArrayList<>();
        this.userAnswersList = new ArrayList<>();
    }

    // Add a question to the quiz
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Run the quiz
    public void runQuiz(Scanner scanner) {
        for (Question question : questions) {
            question.displayQuestion();

            // Get user input for answers
            System.out.print("Your answer(s): ");
            String userInput = scanner.nextLine();
            List<String> userAnswers = List.of(userInput.split("\\s+"));

            // Consume the newline character
            scanner.nextLine();

            // Store user answers
            userAnswersList.add(userAnswers);
        }
    }

    // Grade the quiz
    public void gradeQuiz() {
        int totalQuestions = questions.size();
        int correctAnswers = 0;

        for (int i = 0; i < totalQuestions; i++) {
            Question question = questions.get(i);
            List<String> userAnswers = userAnswersList.get(i);

            question.displayQuestion();
            boolean isCorrect = question.isCorrect(userAnswers);

            // Update correctAnswers count
            if (isCorrect) {
                correctAnswers++;
            }

            // Display whether the user's answer was correct or not
            System.out.println(isCorrect ? "Your answer(s) were correct!\n" : "Your answer(s) were incorrect!\n");
        }

        // Print the results
        System.out.println("Quiz Grade: " + correctAnswers + "/" + totalQuestions);
    }
}