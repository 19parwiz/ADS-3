import java.util.Hashtable;
import java.util.Random;

public class MyHashTable<K, V> {
    private static class HashNode<K, V> {
        private K key;
        private V val;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.val = value;
        }

        @Override
        public String toString() {
            return "( " + key + "," + val + ")";
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11; // default number of chains
    private int size;

    public MyHashTable() {
        chainArray = new HashNode[M];
    }

    public MyHashTable(int M) {
        this.M = M;
        chainArray = new HashNode[M];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % M);
    }

    public void put(K key, V value) {
        int index = hash(key);
        HashNode<K, V> newNode = new HashNode<>(key, value);
        if (chainArray[index] == null) {
            chainArray[index] = newNode;
        } else {
            HashNode<K, V> currentNode = chainArray[index];
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> currentNode = chainArray[index];
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.val;
            }
            currentNode = currentNode.next;
        }
        return null; // key not found
    }

    public V remove(K key) {
        int index = hash(key);
        HashNode<K, V> currentNode = chainArray[index];
        HashNode<K, V> prevNode = null;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                if (prevNode == null) {
                    chainArray[index] = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                size--;
                return currentNode.val;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return null; // key not found in the hash table
    }

    public boolean contains(V value) {
        for (HashNode<K, V> node : chainArray) {
            HashNode<K, V> currentNode = node;
            while (currentNode != null) {
                if (currentNode.val.equals(value)) {
                    return true;
                }
                currentNode = currentNode.next;
            }
        }
        return false; // Value not found
    }

    public void printBucketSize() {
        for (int i = 0; i < M; i++) {
            int count = 0;
            HashNode<K, V> currentNode = chainArray[i];
            while (currentNode != null) {
                count++;
                currentNode = currentNode.next;
            }
            System.out.println(" Buckets  " + i + " : " + count + " elementss");
        }
    }

    public static void main(String[] args) {
        MyHashTable<Integer, String> table = new MyHashTable<>();
        Random random = new Random();

        // Add random 10000 elements to the hash table
        for (int i = 0; i < 10000; i++) {
            Integer key = random.nextInt(100);
            table.put(key, "Value:" + i);
        }

        // Print number of elements in each bucket
        table.printBucketSize();
    }
}
