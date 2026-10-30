import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // An array has a fixed length once it is created.
        int[] numbersArray = {10, 20, 30};
        System.out.println("Array values:");
        for (int number : numbersArray) {
            System.out.println(number);
        }
        System.out.println("Array length: " + numbersArray.length);

        // An ArrayList can grow or shrink as the program runs.
        // Integer is a wrapper class because ArrayList cannot use primitive int directly.
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40); // Adds a fourth element without recreating the list.

        System.out.println("\nArrayList values:");
        for (int number : numbersList) {
            System.out.println(number);
        }
        System.out.println("ArrayList size: " + numbersList.size());

        // Arrays use bracket indexing; ArrayLists use get() and remove().
        System.out.println("First array value: " + numbersArray[0]);
        System.out.println("First ArrayList value: " + numbersList.get(0));
        numbersList.remove(Integer.valueOf(20));
        System.out.println("ArrayList after removing 20: " + numbersList);
    }
}