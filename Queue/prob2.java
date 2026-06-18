// Generate first n binary numbers using a Queue

package Queue;

import java.util.*;

public class prob2 {

    public static void main(String[] args) {

        // Create a queue to store binary strings
        Queue<String> q1 = new LinkedList<>();

        // Number of binary values to print
        int n = 6;

        // Start with the first binary number
        q1.add("1");

        System.out.print("binary numbers: ");

        // Loop n times to generate n binary numbers
        for (int i = 1; i <= n; i++) {

            // Remove the front element from the queue
            String current = q1.remove();

            // Print the current binary number
            System.out.print(current + " ");

            /*
             * Generate the next two binary numbers:
             *
             * If current = "10"
             * then:
             * "10" + "0" = "100"
             * "10" + "1" = "101"
             */

            // Add left child (append 0)
            q1.add(current + "5");

            // Add right child (append 1)
            q1.add(current + "6");
        }
    }
}