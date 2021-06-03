/*
 *  UCF COP3330 Summer 2021 Exercise 2 Solution
 *  Copyright 2021 Christopher Gray
 */

package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String input = myApp.readInput();
        String output = myApp.generateOutputString(input);
        myApp.displayOutput(output);
    }

    public String readInput() {
        System.out.print("What is the input string? ");
        return in.nextLine();
    }

    public String generateOutputString(String input) {
        return input + " has " + input.length() + " characters.";
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }
}
