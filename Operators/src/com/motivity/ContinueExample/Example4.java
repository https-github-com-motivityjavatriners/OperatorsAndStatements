package com.motivity.ContinueExample;

//Program to illustrate the use of continue statement
// inside an inner loop or simply nested loops
public class Example4 {

    public static void main(String[] args)
    {
        // Outer loop for iteration
        for (int i = 1; i <= 4; i++) {

            // Inner loop for iteration
            for (int j = 1; j <= 3; j++) {
                if (i == 3 && j == 2) {

                    // Continue statement in inner loop to
                    // skip the execution when i==3 and j==2

                    continue;
                }

                // Print elements to showcase keyword affect
                System.out.println(i + " * " + j);
            }
        }
    }

}
