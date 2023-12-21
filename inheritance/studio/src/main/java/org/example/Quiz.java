package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Quiz {
    private List<Question> questions;

    // Constructor
    public Quiz() {
        this.questions = new ArrayList<>();
    }

    // Add a question to the quiz
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Run the quiz
    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            question.displayQuestion();

            // Get user input for answers
            System.out.print("Your answer(s): ");
            String userInput = scanner.nextLine();
            List<String> userAnswers = List.of(userInput.split("\\s+"));

            // Check if the answers are correct
            boolean isCorrect = question.isCorrect(userAnswers);

            // Display whether the answer is correct or not
            System.out.println(isCorrect ? "Correct!\n" : "Incorrect!\n");
        }

        scanner.close();
    }

    // Grade the quiz
    public void gradeQuiz() {
        int totalQuestions = questions.size();
        int correctAnswers = 0;

        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            question.displayQuestion();

            // Get user input for answers
            System.out.print("Your answer(s): ");
            String userInput = scanner.nextLine();
            List<String> userAnswers = List.of(userInput.split("\\s+"));

            // Check if the answers are correct
            boolean isCorrect = question.isCorrect(userAnswers);

            // Update correctAnswers count
            if (isCorrect) {
                correctAnswers++;
            }
        }

        scanner.close();

        System.out.println("Quiz Grade: " + correctAnswers + "/" + totalQuestions);
    }
}

