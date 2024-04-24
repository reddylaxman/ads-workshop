import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Object> l1 = new ArrayList<>();
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Orange");
        l1.add(78);
        l1.add(78.90);
        System.out.println("Element at index 0: " + l1.get(0));
        // System.out.println("Elements in the ArrayList");
        for (Object fruit : l1) {
            System.out.println(fruit);
        }
    }
}

/*
 * output
 * Element at index 0: Apple
 * Elements in the ArrayList
 * Apple
 * Banana
 * Orange
 * 78
 * 78.9
 */
