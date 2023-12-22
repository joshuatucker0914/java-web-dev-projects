package org.example;
import java.util.List;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        // Create a quiz
        Quiz quiz = new Quiz();

        // Create questions and add them to the quiz
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of France?",
                List.of("Berlin", "Paris", "Madrid", "Rome"), 1));

        quiz.addQuestion(new CheckboxQuestion("Which of the following are mammals?",
                List.of("Shark", "Dog", "Bird", "Cat"), List.of(1,2,4)));

        quiz.addQuestion(new TrueFalseQuestion("Is the Earth flat?", false));

        // Create a scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Run the quiz
            quiz.runQuiz(scanner);

            // Grade the quiz
            quiz.gradeQuiz();
        }
    }
}