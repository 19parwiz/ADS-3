import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer, String> table = new MyHashTable<>();
        Random random = new Random();


        // Add Radomly 10000 elements to the Hash  table

        for (int i = 0; i < 10000; i++) {
            Integer key = random.nextInt(100);
            table.put(key, "Value" + i);
        }

            // Print number of each element in every single boucket
        table.printBucketSize();


    }
}





