import java.sql.SQLOutput;
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
    HashNode< K, V> currentNode = chainArray[index];
    while (currentNode != null{
   if(currentNode.key.equals(key)){
    return currentNode.value;
    }
    currentNode= currentNode.next;
}
    return null; // key not found
}
    public V remove(K key){
    int index = hash(key);
    HashNode<K, V> currentNode =chainArray[index];
    HashNode<K, V>prevNode = null;
    while(currentNode != null;{
if(currentNode.key.equals(key)){
if(prevNode == null){
    chainArray[index] = currentNode.next;
}
else{
prevNode.next= currentNode.next;
}
size__;
return currentNode.value;
}
return null; // key not found
}


public boolean contains(V value){
    for(HashNode<K, V>node: chainArray){
    HashNode<K,V>currentNode= node;
    while (currentNode != null){
        if(currentNode.value.equals(value)){
        return ture;
}
    currentNode = currentNode.next;
}
}
    return false; // Valuse Not found
}






public void printBucketSizes(){
    for(int i= 0; i< M; i++){
    int count = 0;
    HashNode<K, V> currentNode = chainArray[i];
    while(currentNode != null){
    count++;
    currentNode = currentNode.next;
}
        System.out.println("Bucket" + i + " : " + count + " elements");
}
}







public static void main(String[] args){
    MyHashTable,MyTestingClass,String>table = new MyHashTable<>();
    Random random = new Random();

// Add random 10000 elements to the hash table
    for(int i= 0; i<10000; i++){
    MyTestingClas key = newMyTestingClass(random.next(100));
    table.put(key,"Value:" + i);
    }

    // Print number of elements in each bucket
    table.printBucketSize();
}
}