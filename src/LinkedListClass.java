import java.util.LinkedList;

public class LinkedListClass {
        public static void main(String[] args) {
                // 26. Write a Java program to replace an element in a linked list.
                System.out.println("26. Write a Java program to replace an element in a linked list.");
                LinkedList<String> colors = new LinkedList<>();
                colors.add("Red");
                colors.add("Green");
                colors.add("Orange");
                System.out.println("Original linked list: " + colors);
                colors.set(1, "White");
                System.out.println("Replace second element with 'White'.");
                System.out.println("New linked list: " + colors);

                // 11. Write a Java program to display elements and their positions in a linked
                // list.
                System.out.println(
                                "11. Write a Java program to display elements and their positions in a linked list.");
                for (int i = 0; i < colors.size(); i++) {
                        System.out.println(colors.get(i));
                }

                // 12. Write a Java program to remove a specified element from a linked list.
                System.out.println("12. Write a Java program to remove a specified element from a linked list.");
                colors.remove("Green");
                System.out.println("Linked list after removing 'Green': " + colors);

                // 13. Write a Java program to remove the first and last elements from a linked
                // list.
                System.out.println(
                                "13. Write a Java program to remove the first and last elements from a linked list.");
                colors.removeFirst();
                colors.removeLast();
                System.out.println("Linked list after removing first and last elements: " + colors);

                // 14. Write a Java program to remove all elements from a linked list.
                System.out.println("14. Write a Java program to remove all elements from a linked list.");
                colors.clear();
                System.out.println("Linked list after removing all elements: " + colors);

                // 17. Write a Java program to join two linked lists.
                System.out.println("17. Write a Java program to join two linked lists.");
                LinkedList<String> moreColors = new LinkedList<>();
                moreColors.add("Blue");
                moreColors.add("Yellow");
                colors.addAll(moreColors);
                System.out.println("Linked list after joining: " + colors);

        }
}
