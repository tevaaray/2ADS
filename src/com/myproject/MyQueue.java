package com.myproject;

public class MyQueue<T> {
    private MyList<T> list = new MyLinkedList<>();

    public void enqueue(T value) {
        list.add(value);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T value = list.get(0);
        list.remove(0);
        return value;
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
