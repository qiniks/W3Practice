import java.util.*;

public class JavaPriorityQueueExercises {
    public static void main(String[] args) {
        // 6. Write a Java program to count the number of elements in a priority queue.
        System.out.println("6. Write a Java program to count the number of elements in a priority queue.");
        PriorityQueue<String> pq = new PriorityQueue<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Number of elements in the priority queue: " + pq.size());

        // 7. Write a Java program to compare two priority queues.
        System.out.println("7. Write a Java program to compare two priority queues.");
        PriorityQueue<String> pq2 = new PriorityQueue<>(Arrays.asList("Red", "Green", "Yellow"));
        System.out.println("is equal? " + pq.equals(pq2));

        // 8. Write a Java program to retrieve the first element of the priority queue.
        System.out.println("8. Write a Java program to retrieve the first element of the priority queue.");
        System.out.println("First element of the priority queue: " + pq.peek());

        // 9. Write a Java program to retrieve and remove the first element.
        System.out.println("9. Write a Java program to retrieve and remove the first element.");
        System.out.println("First element removed: " + pq.poll());

        // 10. Write a Java program to convert a priority queue to an array containing
        // all its elements.
        System.out.println(
                "10. Write a Java program to convert a priority queue to an array containing all its elements.");
        List<String> array = new ArrayList<>(pq);
        System.out.println("Array: " + array);

        // 11. Write a Java program to convert a Priority Queue element to string
        // representations.
        System.out.println("11. Write a Java program to convert a Priority Queue element to string representations.");
        String pqString = pq.toString();
        System.out.println("Priority Queue as String: " + pqString);

        // 12. Write a Java program to change priorityQueue to maximum priority queue.
        System.out.println("12. Write a Java program to change priorityQueue to maximum priority queue.");
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.addAll(Arrays.asList(21, 4, 3, 5));
        System.out.println("Maximum Priority Queue: " + maxPQ);
    }
}