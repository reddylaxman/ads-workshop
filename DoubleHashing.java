import java.util.Arrays;
public class DoubleHashing {
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put(5);
        ht.put(15);
        ht.put(25);
        ht.put(35);
        ht.put(45);
        ht.put(55);
        ht.put(65);
        ht.put(75);
        ht.put(85);
        ht.put(95);
        ht.put(105); // Hash table is full, unable to insert

        ht.display();
    }
}
class HashTable {
    private int[] data;

    public HashTable(int size) {
        data = new int[size];
        Arrays.fill(data, -1); // Initialize all slots as empty (-1 indicates an empty slot)
    }

    private int hash1(int key) {
        return key % data.length; // First hash function
    }

    private int hash2(int key) {
        return 7 - (key % 7); // Second hash function
    }

    public void put(int key) {
        int index = hash1(key);
        int i = 0; // Number of probing attempts

        // Double hashing until an empty slot is found or table is full
        while (data[index] != -1) {
            index = (hash1(key) + i * hash2(key)) % data.length; // Double hashing formula
            if (i == data.length) {
                System.out.println("Hash table is full. Unable to insert key: " + key);
                return; // Hash table is full
            }
            i++;
        }

        // Insert the key into the empty slot
        data[index] = key;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Index " + i + ": " + data[i]);
        }
    }
}
/*
output:-
Hash table is full. Unable to insert key: 105
Index 0: 65
Index 1: 15
Index 2: 35
Index 3: 85
Index 4: 95
Index 5: 5
Index 6: 55
Index 7: 75
Index 8: 25
Index 9: 45
 */

