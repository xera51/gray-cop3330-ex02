/*
 *  UCF COP3330 Summer 2021 Exercise 2 Solution
 *  Copyright 2021 Christopher Gray
 */

package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_input_and_proper_length_of_string() {
        App myApp = new App();
        String testString = "This is a long string to test functionality.";

        String expectedOutput = "This is a long string to test functionality. has 44 characters.";
        String actualOutput = myApp.generateOutputString(testString);

        assertEquals(expectedOutput, actualOutput);
    }
}