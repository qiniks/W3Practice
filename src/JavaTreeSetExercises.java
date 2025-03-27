import java.util.TreeSet;

public class JavaTreeSetExercises {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        // 11. Write a Java program to get the element in a tree set less than or equal
        // to the given element.
        System.out.println("11. Element less than or equal to 3: " + treeSet.floor(3));

        // 12. Write a Java program to get the element in a tree set strictly greater
        // than or equal to the given element.
        System.out.println("12. Element greater than or equal to 3: " + treeSet.ceiling(3));

        // 13. Write a Java program to get an element in a tree set that has a lower
        // value than the given element.
        System.out.println("13. Element lower than 3: " + treeSet.lower(3));

        // 14. Write a Java program to retrieve and remove the first element of a tree
        // set.
        System.out.println("14. First element removed: " + treeSet.pollFirst());
        System.out.println("TreeSet after removing first element: " + treeSet);

        // 15. Write a Java program to retrieve and remove the last element of a tree
        // set.
        System.out.println("15. Last element removed: " + treeSet.pollLast());
        System.out.println("TreeSet after removing last element: " + treeSet);

        // 16. Write a Java program to remove a given element from a tree set.
        treeSet.remove(3);
        System.out.println("16. TreeSet after removing element 3: " + treeSet);
    }
}