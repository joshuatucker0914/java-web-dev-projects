package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        // Create a quiz
        Quiz quiz = new Quiz();

        // Create questions and add them to the quiz
        quiz.addQuestion(new Question.MultipleChoiceQuestion("What is the capital of France?",
                List.of("Berlin", "Paris", "Madrid", "Rome"), 1));

        quiz.addQuestion(new Question.CheckboxQuestion("Which of the following are mammals?",
                List.of("Shark", "Dog", "Bird", "Cat"), List.of(1, 2, 4)));

        quiz.addQuestion(new Question.TrueFalseQuestion("Is the Earth flat?", false));

        // Run the quiz
        quiz.runQuiz();

        // Grade the quiz
        quiz.gradeQuiz();
    }
}
