import java.util.*;

public class JavaHashMapExercises {
    public static void main(String[] args) {
        // 6. Write a Java program to get a shallow copy of a HashMap instance.
        System.out.println("6. Write a Java program to get a shallow copy of a HashMap instance.");
        HashMap<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        HashMap<String, String> copy = (HashMap) map.clone();
        System.out.println("Original HashMap: " + map);
        System.out.println("Shallow Copy: " + copy);

        // 7. Write a Java program to test if a map contains a mapping for the specified
        // key.
        System.out.println("7. Write a Java program to test if a map contains a mapping for the specified key.");
        System.out.println("Contains 'Key1': " + map.containsKey("Key1"));

        // 8. Write a Java program to test if a map contains a mapping for the specified
        // value.
        System.out.println("8. Write a Java program to test if a map contains a mapping for the specified value.");
        System.out.println("Contains 'Value2': " + map.containsValue("Value2"));

        // 9. Write a Java program to create a set view of the mappings contained in a
        // map.
        System.out.println("9. Write a Java program to create a set view of the mappings contained in a map.");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("Set view of mappings: " + entrySet);

        // 10. Write a Java program to get the value of a specified key in a map.
        System.out.println("10. Write a Java program to get the value of a specified key in a map.");
        System.out.println("Value for 'Key1': " + map.get("Key1"));

        // 11. Write a Java program to get a set view of the keys contained in this map.
        System.out.println("11. Write a Java program to get a set view of the keys contained in this map.");
        Set<String> keySet = map.keySet();
        System.out.println("Set view of keys: " + keySet);

        // 12. Write a Java program to get a collection view of the values contained in
        // this map.
        System.out.println("12. Write a Java program to get a collection view of the values contained in this map.");
        System.out.println(map.values());
    }
}