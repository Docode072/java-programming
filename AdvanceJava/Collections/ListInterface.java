package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ManipulateList {
    // This class can contain methods to manipulate lists
    public String[] removeAssignedCode(String[] asssignedCode, String[] allCodes){
        List<String> list1 = new ArrayList<String>(Arrays.asList(allCodes));
        List<String> list2 = new ArrayList<String>(Arrays.asList(asssignedCode)); 

        list1.removeAll(list2);


        return list1.toArray(new String[list1.size()]);
    }
}
   

public class ListInterface {
    public static void main(String[] args) {
        ManipulateList ml = new ManipulateList();
        String[] assignedCodes = {"A101", "B202", "C303"};
        String[] allCodes = {"A101", "B202", "C303", "D404", "E505"};

        String[] unassignedCodes = ml.removeAssignedCode(assignedCodes, allCodes);

        System.out.println("Unassigned Codes:");
        System.out.println(Arrays.toString(unassignedCodes));

    }
}

/*
Notte: List interface in Java is a part of the Java Collections Framework and represents an ordered collection (also known as a sequence) of elements. 
It allows duplicate elements and provides methods to manipulate the size and contents of the list. 
Common implementations of the List interface include ArrayList, LinkedList, and Vector.

Key features of the List interface:
1. Ordered Collection: Elements in a List are ordered based on their insertion order.
2. Duplicates Allowed: Lists can contain duplicate elements.
3. Indexed Access: Elements can be accessed, inserted, or removed based on their index position.
4. Dynamic Size: Lists can grow or shrink in size as elements are added or removed.
5. Common Methods: The List interface provides various methods such as add(), remove(), get(), set(), size(), contains(), indexOf(), and more for manipulating the list.

Example usage of List interface:
1) ArrayList: A resizable array implementation of the List interface.
ex:
List<String> arrayList = new ArrayList<>();
arrayList.add("Apple");
arrayList.add("Banana");
System.out.println(arrayList.get(0)); // Output: Apple
2) LinkedList: A doubly-linked list implementation of the List interface.
ex:
List<String> linkedList = new LinkedList<>();
linkedList.add("Cat");
linkedList.add("Dog");
System.out.println(linkedList.size()); // Output: 2
System.out.println(linkedList.contains("Dog")); // Output: true
System.out.println(linkedList.indexOf("Cat")); // Output: 0

Note: Linklist provides better performance for insertions and deletions compared to ArrayList, which is more efficient for random access.
Q1 >How Linklist store data?
A1 >LinkedList in Java stores data using a series of nodes, where each node contains two main components: the data (or value) and a reference (or pointer) to the next node in the sequence. 
In the case of a doubly linked list, each node also contains a reference to the previous node.
class Node {
    Object data; // The data stored in the node, and "Object" is a generic type that can hold any type of data. it is inherited by all classes in Java.
    Node next;   // Reference to the next node
    Node prev;   // Reference to the previous node (for doubly linked list)

    public Node(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class LinkedList {
    Node head; // Reference to the first node in the list
    Node tail; // Reference to the last node in the list

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Methods to add, remove, and manipulate nodes would go here
}
In this structure, the "head" node represents the beginning of the linked list, and the "tail" node represents the end. Each node points to the next node in the list, allowing
*/
