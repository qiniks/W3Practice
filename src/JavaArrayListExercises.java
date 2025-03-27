import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListExercises {
        public static void main(String[] args) {
                // 22. Write a Java program to print all the elements of an ArrayList using the
                // elements' position.
                System.out.println(
                                "22. Write a Java program to print all the elements of an ArrayList using the elements' position.");
                ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));
                for (int i = 0; i < colors.size(); i++) {
                        System.out.println(colors.get(i));
                }

                // 21.Write a Java program to replace the second element of an ArrayList with
                // the specified element.
                System.out.println(
                                "21.Write a Java program to replace the second element of an ArrayList with the specified element.");
                ArrayList<String> colors1 = new ArrayList<>(Arrays.asList("Red", "Green", "Orange"));
                colors1.set(1, "White");
                System.out.println(colors1);

                // 20. Write a Java program to increase an array list size.
                System.out.println("20. Write a Java program to increase an array list size.");
                ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
                numbers.ensureCapacity(6);
                numbers.add(4);
                numbers.add(5);
                numbers.add(6);
                System.out.println(numbers);

                // 19. Write a Java program for trimming the capacity of an array list.
                System.out.println("19. Write a Java program for trimming the capacity of an array list.");
                ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));
                System.out.println("Original array list: " + numbers1);
                numbers1.trimToSize();
                System.out.println("Trimmed array list: " + numbers1);

                // 18. Write a Java program to test whether an array list is empty or not.
                System.out.println("18. Write a Java program to test whether an array list is empty or not.");
                System.out.println(colors.isEmpty());

                // 17. Write a Java program to empty an array list.
                System.out.println("17. Write a Java program to empty an array list.");
                colors.clear();
                System.out.println(colors);

        }
}
