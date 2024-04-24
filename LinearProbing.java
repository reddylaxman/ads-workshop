import java.util.Arrays;
public class LinearProbing {
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
    private int hash(int key) {
        return key % data.length;
    }
    public void put(int key) {
        int hashKey = hash(key);
        int index = hashKey;
        // Linear probing until an empty slot is found
        while (data[index] != -1) {
            index = (index + 1) % data.length; // Move to the next slot
            if (index == hashKey) {
                System.out.println("Hash table is full. Unable to insert key: " + key);
                return; // Hash table is full
            }
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
Index 0: 55
Index 1: 65
Index 2: 75
Index 3: 85
Index 4: 95
Index 5: 5
Index 6: 15
Index 7: 25
Index 8: 35
Index 9: 45
 */
