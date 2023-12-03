package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main (String[]args){
        // Prompt the user for the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Circle.getArea(radius);

        // Print the result
        System.out.println("The area of the circle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
