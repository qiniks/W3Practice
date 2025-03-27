import java.util.TreeMap;

public class JavaTreeMapExercises {
    public static void main(String[] args) {
        // 26. Write a Java program to get the least key greater than or equal to the
        // given key. Returns null if there is no such key.
        System.out.println(
                "26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Orange");
        treeMap.put(4, "Red");
        treeMap.put(33, "Blue");
        treeMap.put(5, "Yellow");
        treeMap.put(2, "Green");

        System.out.println("Original TreeMap: " + treeMap);
        System.out.println("Least key greater than or equal to 3: " + treeMap.ceilingKey(0));

        // 25. Write a Java program to get a key-value mapping associated with the least
        // key greater than or equal to the given key. Return null if there is no such
        // key.
        System.out.println(
                "25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.");
        System.out.println("Least key greater than or equal to 3: " + treeMap.ceilingEntry(20));

        // 24. Write a Java program to get a portion of a map whose keys are greater
        // than a given key.
        System.out.println(
                "\n24. Write a Java program to get a portion of a map whose keys are greater than a given key.");
        System.out.println("Keys greater than 4: " + treeMap.tailMap(4, false));

        // 23. Write a Java program to get a portion of a map whose keys are greater
        // than or equal to a given key.
        System.out.println(
                "\n23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.");
        System.out.println("Keys greater than or equal to 4: " + treeMap.tailMap(4));

        // 21. Write a Java program to get the portion of a map whose keys range from a
        // given key (inclusive) to another key (exclusive).
        System.out.println(
                "21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).");
        System.out.println("Sub map from key 2 (inclusive) to 5 (exclusive): " + treeMap.subMap(2, 5));

        // 22. Write a Java program to get the portion of a map whose keys range from a
        // given key to another key.
        System.out.println(
                "\n22. Write a Java program to get the portion of a map whose keys range from a given key to another key.");
        System.out.println("Sub map from key 2 (inclusive) to 5 (inclusive): " + treeMap.subMap(2, true, 5, true));

    }

}
