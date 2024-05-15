"# ADS-3" 
"# ADS-3" 
# Data Structures Implementation

This repository contains Java implementations of two data structures:

1. MyHashTable: Implements a basic hash table using chaining for collision resolution.
   It provides methods for putting, getting, removing elements, checking for element existence,
   and printing the size of each bucket.

2. BST (Binary Search Tree): Implements a binary search tree with methods for putting, getting,
   and deleting nodes. It also includes an iterator for in-order traversal.

## Usage

You can use these data structures in your Java projects by following these steps:

1. Copy the relevant class (MyHashTable or BST) into your project.
2. Create instances of the classes and use their methods to store and retrieve data.

### Example Usage

```java
MyHashTable<Integer, String> table = new MyHashTable<>();
table.put(1, "One");
table.put(2, "Two");
String value = table.get(1); // Retrieves "One"
