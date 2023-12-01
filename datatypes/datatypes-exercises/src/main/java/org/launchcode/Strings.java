package org.launchcode;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        // The sentence from Alice's Adventures in Wonderland
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        // Create a Scanner object to handle user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a term to search for
        System.out.print("Enter a term to search for in the sentence: ");
        String searchTerm = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive search

        // Perform case-insensitive search
        boolean termFound = aliceSentence.toLowerCase().contains(searchTerm);

        if (termFound) {
            // Find the index and length of the entered word
            int index = aliceSentence.toLowerCase().indexOf(searchTerm);
            int length = searchTerm.length();

            // Print the index and length of the entered word
            System.out.println("Index of '" + searchTerm + "': " + index);
            System.out.println("Length of '" + searchTerm + "': " + length);

            // Remove the word from the sentence
            aliceSentence = aliceSentence.substring(0, index) + aliceSentence.substring(index + length);

            // Print the updated sentence
            System.out.println("Updated sentence after removing '" + searchTerm + "':");
            System.out.println(aliceSentence);
        } else {
            System.out.println("Search term '" + searchTerm + "' not found in the sentence.");
        }

        // Close the Scanner to avoid resource leak
        scanner.close();
    }

}
