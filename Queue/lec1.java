package Queue;

import java.util.*; // This covers both Queue and LinkedList

public class lec1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        
        System.out.println(q1);           // Output: [10, 20, 30, 40, 50]
        System.out.println(q1.remove());  // Output: 10
        System.out.println(q1);           // Output: [20, 30, 40, 50]
        System.out.println(q1.peek());
        q1.offer(100);
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        System.out.println(q1.element());
        for(int x : q1){
            System.out.println(x + " ");

        }
        System.out.println();
        System.out.println(q1.size());
        while(!q1.isEmpty())
        {
            System.out.println(q1.poll());
        }
            System.out.println(q1.isEmpty());
    }
}
