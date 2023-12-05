package org.example;
import java.util.Arrays;
public class Array {
    public static void main(String[]args){
        //int[] array = {1, 1, 2, 3, 5, 8};
        //Step 1 Loop through array

       /* for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        */
        // Step 1.2 Print only odd numbers
        /*
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
        */

        /*
        //Step 2
        //Initial Phrase
        String Phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //Breaking the Phrase into sections.
        String[] BrokenPhrase = Phrase.split(" ");
        //Printing "Pieces:" Prior to the section that is being displayed.
        System.out.println("Pieces: ");
        // Printing the section of text from the "BrokenPhrase" array which section is the variable for.
        for(String sections: BrokenPhrase){
            System.out.println(sections);
        }
        */

        //Step 2.1
        //Initial Phrase
        String Phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //Breaking the Phrase into sections.
        String[] BrokenPhrase = Phrase.split("\\.");
        //Printing "Pieces:" Prior to the section that is being displayed.
        System.out.println("Pieces: ");
        // Printing the section of text from the "BrokenPhrase" array which section is the variable for.
        for(String sections: BrokenPhrase){
            System.out.println(sections);
        }

    }
}
