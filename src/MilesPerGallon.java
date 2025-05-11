/********************************************************
 * Miles-per-Gallon Calculator                          *
 * This program calculates the miles-per-gallon (MPG)   *
 * of a car based on user input for miles driven and    *
 * gallons of gas used.                                 *
 ********************************************************/

import java.util.Scanner;

public class MilesPerGallon {

    /********************************************************
     * Main Method                                          *
     * Prompts the user for miles driven and gallons used,  *
     * calculates the MPG, and displays the result.         *
     ********************************************************/
    public static void main(String[] args) {

        //**********************************************
        // Variable Declarations                       *
        // To store user input and calculated values   *
        //**********************************************
        double milesDriven;          // Total miles driven
        double gallonsUsed;          // Total gallons of gas used
        double milesPerGallon;       // Calculated miles-per-gallon

        //**********************************************
        // Input Section                               *
        // Prompting the user to enter values for miles*
        // driven and gallons of gas used              *
        //**********************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the number of miles driven: ");
        milesDriven = keyboardInput.nextDouble();

        System.out.print("Enter the number of gallons of gas used: ");
        gallonsUsed = keyboardInput.nextDouble();

        //**********************************************
        // Calculation Section                         *
        // Calculate the miles-per-gallon (MPG) value  *
        //**********************************************
        milesPerGallon = milesDriven / gallonsUsed;

        //**********************************************
        // Output Section                              *
        // Display the calculated MPG to the user      *
        //**********************************************
        System.out.printf("\nMiles-per-Gallon (MPG): %.2f\n", milesPerGallon);

        //**********************************************
        // Developer Credit                            *
        //**********************************************
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        //**********************************************
        // Resource Cleanup                            *
        // Close the scanner to prevent resource leaks *
        //**********************************************
        keyboardInput.close();
        System.exit(0);
    }
}
