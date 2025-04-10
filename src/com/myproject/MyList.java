package com.myproject;

public interface MyList<T> {
    void add(T element);
    T get(int index);
    int size();
    void remove(int index);
    boolean isEmpty();
}
