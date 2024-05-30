import java.util.Random;

public class HashTableTest {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
        Random random = new Random();

        // Add random 10000 elements to the hash table
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(10000));
            table.put(key, "Value:" + i);
        }

        // Print number of elements in each bucket
        table.printBucketSize();
    }
}
