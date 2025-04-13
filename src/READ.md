# Custom Data Structures in Java

This project is about implementing custom data structures in Java without using `java.util.*` 
(except `Iterator`). I created my own versions of `ArrayList`, `LinkedList`, `Stack`, `Queue`, and `MinHeap`.

## Implemented Classes

- MyList\<T\> – an interface that defines the basic list methods like `add`, `get`, `remove`, etc.
- MyArrayList\<T\> – dynamic array implementation based on `MyList`.
- MyLinkedList\<T\> – doubly linked list that also implements `MyList`.
- MyStack\<T\> – simple stack built using `MyArrayList`.
- MyQueue\<T\> – queue implemented using `MyLinkedList`.
- MyMinHeap\<T extends Comparable\<T\>\> – basic min-heap using `MyArrayList`.


The `Main.java` file shows how these structures can be used:
- adding and accessing elements in lists
- pushing/popping from the stack
- enqueueing/dequeueing in the queue
- adding and polling the min-heap
