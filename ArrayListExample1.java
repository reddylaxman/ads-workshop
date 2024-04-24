import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Orange");
        System.out.println("Element at index 0: " + l1.remove(0));
        System.out.println("Elements in the ArrayList");
        for (String fruit : l1) {
            System.out.println(fruit);
        }
    }
}
/*
 * Element at index 0: Apple
 * Elements in the ArrayList
 * Banana
 * Orange
 */