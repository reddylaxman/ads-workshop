import java.util.LinkedList;

public class SeparateChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable ht = new HashTable(10);
		ht.put(5);
		ht.put(15);
		ht.display();
	}

}
class HashTable{
	private LinkedList<Integer>[] data;
	public HashTable(int size) {
		data = (LinkedList<Integer>[]) new Object[size];

		for(int i = 0; i < size; i++) {
			data[i] = new LinkedList<>();
		}
	}
	private int hash(int key) {
		return key % data.length;
	}
	public void put(int key) {
		int hashKey = hash(key);
		data[hashKey].add(key);
	}
	
	public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Index " + i + ": ");
            for (int j : data[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
SeparateChaining.java:17: warning: [unchecked] unchecked cast
                data = (LinkedList<Integer>[]) new LinkedList[size];
                                               ^
  required: LinkedList<Integer>[]
  found:    LinkedList[]
1 warning
Index 0:
Index 1:
Index 2:
Index 3:
Index 4:
Index 5: 5 15
Index 6:
Index 7:
Index 8:
Index 9:
 */