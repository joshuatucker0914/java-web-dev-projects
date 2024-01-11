package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        try {
            int result = Divide(10, 2);
            System.out.println("Result of division: " + result);

            // Test division by zero
            result = Divide(5, 0);
            System.out.println("Result of division: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test out your CheckFileExtension() function!
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            try {
                int points = CheckFileExtension(fileName);
                System.out.println(student + " received " + points + " points.");
            } catch (Exception e) {
                System.out.println(student + ": Error - " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y) {
        // Write code here!
        return 0; // Placeholder return statement
    }

    public static int CheckFileExtension(String fileName) throws Exception {
        if (fileName == null || fileName.isEmpty()) {
            throw new Exception("File name is null or empty. Student receives -1 points.");
        } else if (fileName.endsWith(".java")) {
            return 1; // Student receives 1 point for a valid Java file
        } else {
            return 0; // Student receives 0 points for a file with an invalid extension
        }
    }
}