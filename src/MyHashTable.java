import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

public class MyHashTable<K, V>{
    private static class HashNode<K, V>{
        private K key;
        private V vaule;
        private HashNode<K, V> next;

        public HashNode(K key, V vaule){
            this.key = key;
            this.vaue = vaule;

        }
        @Override
        public String toString(){
            return "( "+ key + "," + value + ")";

        }

    }
    private HashNode<K, V>[] chainArray;
    private int M = 11; // default number of chains
    private int size;

    public MyHashTable(){
        chainArray = new Hashtable[M];

    }
    public MyHashTable(int M){
        this.M = M;
        chainArray = new Hashtable[m];

    }
    private int hash(K key){
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

}
public V get (K key){
    int index = hash(key);
    HashNode< K, V> curre
}