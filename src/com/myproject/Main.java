package com.myproject;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("one");
        queue.enqueue("two");

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
