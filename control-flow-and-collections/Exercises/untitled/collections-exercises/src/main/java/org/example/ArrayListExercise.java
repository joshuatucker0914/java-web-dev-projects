package org.example;
import  java.util.ArrayList;
import  java.util.Scanner;
public class ArrayListExercise {
    public static void main(String[]args){
        // Creating an ArrayList with at least 10 integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(15);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);
        numbers.add(7);
        numbers.add(4);

        // Calling the method to find the sum of even numbers
        int evenSum = isSumEven(numbers);
        // Displaying the result
        System.out.println("Sum of even numbers: " + evenSum);
    }
    public static int isSumEven(ArrayList<Integer> arr){
        int sum = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static class WordLengthChecker {
        public static void main(String[] args) {
            // Creating an ArrayList of words
            ArrayList<String> words = new ArrayList<>();
            words.add("apple");
            words.add("banana");
            words.add("grape");
            words.add("orange");
            words.add("kiwi");
            words.add("melon");
            words.add("peach");
            words.add("mango");
            words.add("watermelon");

            // Prompting the user to enter the word length
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the word length to search for: ");
            int length = scanner.nextInt();
            // Calling the method to print words with exactly 5 letters
            printWordsWithLength(words, length);
        }

        // Static method to print words with a specified length
        public static void printWordsWithLength(ArrayList<String> wordList, int length) {
            System.out.println("Words with exactly " + length + " letters:");
            for (String word : wordList) {
                if (word.length() == length) {
                    System.out.println(word);
                }
            }
        }
    }

}
