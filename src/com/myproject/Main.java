package com.myproject;
public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list.get(0) + " " + list.get(1));

        MyList<Integer> linked = new MyLinkedList<>();
        linked.add(1);
        linked.add(2);
        System.out.println(linked.get(0) + ", " + linked.get(1));

        MyStack<Integer> stack = new MyStack<>();
        stack.push(100);
        stack.push(200);
        System.out.println("stack pop: " + stack.pop());
        System.out.println("stack peek: " + stack.peek());

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("a");
        queue.enqueue("b");
        System.out.println("queue: " + queue.dequeue());
        System.out.println("queue peek: " + queue.peek());

        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(10);
        heap.add(5);
        heap.add(15);
        System.out.println("min: " + heap.poll());
        System.out.println("next min: " + heap.peek());
    }
}
