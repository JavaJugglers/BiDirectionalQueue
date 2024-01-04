# BiDirectionalQueue

## Overview
This project encompasses the implementation of a "Double Ended Queue" (Deque) using both linked lists and arrays. It is divided into three main parts: testing, data structure implementation, and application development. This comprehensive project not only strengthens understanding of data structures but also applies these structures in a practical scenario - a sound synthesizer for Guitar Hero.

### Packages
The project is structured into two primary packages:
1. **Deque Package**: Implements the Deque data structure.
2. **GH2 Package**: Utilizes the Deque package to create a synthesizer for Guitar Hero.

#### Understanding Packages
- A package in Java is a namespace that groups related classes and interfaces. 
- Utilize the `package` keyword to declare a package.
- Packages help avoid name conflicts and can be used to control access.
- Example: `package deque;`

### The Deque API
A Deque, or double-ended queue, is a type of queue allowing insertion and removal of elements from both ends. The API includes:

- `addFirst(T item)`: Insert an item at the front.
- `addLast(T item)`: Insert an item at the rear.
- `isEmpty()`: Check if the deque is empty.
- `size()`: Return the number of items in the deque.
- `printDeque()`: Print the deque elements.
- `removeFirst()`: Remove and return the front item.
- `removeLast()`: Remove and return the rear item.
- `get(int index)`: Retrieve the item at a specified index.
- `equals(Object o)`: Check equality of two deques.

### Testing
- Write JUnit tests in `LinkedListDequeTest.java` and `ArrayDequeTest.java`.
- Test each method in the Deque API.
- Implement the methods in the Deque interface for successful testing.

### Implementations
1. **LinkedListDeque**: Implements Deque using a linked list.
2. **ArrayDeque**: Implements Deque using a dynamic array.

### MaxArrayDeque
- Extends `ArrayDeque` with a `Comparator<T>` for additional functionality.
- Includes methods `max()` and `max(Comparator<T> c)`.

### Guitar Hero Application
- Implement `GuitarString` using the Deque to synthesize guitar sounds with the Karplus-Strong algorithm.
- Use the `gh2` package for the synthesizer implementation.
- Create `GuitarHeroLite` for an interactive sound experience.

### Project Setup
- Ensure all files are placed in their respective packages.
- Use Maven for dependency management and project setup.
