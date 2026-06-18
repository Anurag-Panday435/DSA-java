package Queue;

import java.util.*;

public class prob3 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(60);
        
        System.out.println("Original queue: " + q1);
        
        interleaveQueue(q1);
        
        System.out.println("Interleaved queue: " + q1);
    }
    
    public static void interleaveQueue(Queue<Integer> q1) {
        Queue<Integer> firstHalf = new LinkedList<>();
        Queue<Integer> secondHalf = new LinkedList<>();
        
        int size = q1.size();
        int halfSize = size / 2;
        
        // Step 1: split q1 into two halves
        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(q1.remove());
        }
        while (!q1.isEmpty()) {
            secondHalf.add(q1.remove());
        }
        
        // Step 2: merge back into q1 alternately
        while (!firstHalf.isEmpty() && !secondHalf.isEmpty()) {
            q1.add(firstHalf.remove());
            q1.add(secondHalf.remove());
        }
        
        // Step 3: if odd size, secondHalf had one extra — drain leftovers
        while (!firstHalf.isEmpty()) {
            q1.add(firstHalf.remove());
        }
        while (!secondHalf.isEmpty()) {
            q1.add(secondHalf.remove());
        }
    }
}
