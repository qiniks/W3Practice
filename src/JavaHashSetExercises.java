import java.util.*;

public class JavaHashSetExercises {
    public static void main(String[] args) {
        // 6. Write a Java program to clone a hash set to another hash set.
        System.out.println("6. Write a Java program to clone a hash set to another hash set.");
        HashSet<String> originalSet = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        HashSet<String> clonedSet = (HashSet) originalSet.clone();
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);

        // 7. Write a Java program to convert a hash set to an array.
        System.out.println("7. Write a Java program to convert a hash set to an array.");
        String[] array = originalSet.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));

        // 8. Write a Java program to convert a hash set to a tree set.
        System.out.println("8. Write a Java program to convert a hash set to a tree set.");
        TreeSet<String> treeSet = new TreeSet<>(originalSet);
        System.out.println("TreeSet:" + treeSet);

        // 9. Write a Java program to find numbers less than 7 in a tree set.
        System.out.println("9. Write a Java program to find numbers less than 7 in a tree set.");
        TreeSet<Integer> numberSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("numbers less than 7: " + numberSet.headSet(7));

        // 10. Write a Java program to compare two hash set.
        System.out.println("10. Write a Java program to compare two hash set.");
        HashSet<String> anotherSet = new HashSet<>(Arrays.asList("Red", "Green", "Yellow", "Black"));
        boolean areEqual = originalSet.equals(anotherSet);
        System.out.println("is Equal: " + areEqual);

        // 11. Write a Java program to compare two sets and retain elements that are the
        // same.
        System.out.println("11. Write a Java program to compare two sets and retain elements that are the same.");
        originalSet.retainAll(anotherSet);
        System.out.println("common elements: " + originalSet);

        // 12. Write a Java program to remove all elements from a hash set.
        System.out.println("12. Write a Java program to remove all elements from a hash set.");
        originalSet.clear();
        System.out.println(originalSet);
    }
}