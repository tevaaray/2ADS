package com.myproject;
public class MyMinHeap<T extends Comparable<T>> {
    private MyList<T> list;

    public MyMinHeap() {
        list = new MyArrayList<>();
    }

    public void add(T element) {
        list.add(element);
        heapifyUp(list.size() - 1);
    }

    public T poll() {
        if (list.isEmpty()) {
            return null;
        }
        T result = list.get(0);
        T last = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            replace(0, last);
            heapifyDown(0);
        }

        return result;
    }

    public T peek() {
        return list.isEmpty() ? null : list.get(0);
    }
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }
    private void heapifyDown(int index) {
        int size = list.size();
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && list.get(left).compareTo(list.get(smallest)) < 0) {
                smallest = left;
            }

            if (right < size && list.get(right).compareTo(list.get(smallest)) < 0) {
                smallest = right;
            }

            if (smallest == index) {
                break;
            }

            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        replace(i, list.get(j));
        replace(j, temp);
    }

    private void replace(int index, T element) {
        list.remove(index);
        MyList<T> tempList = new MyArrayList<>();
        for (int i = 0; i < index; i++) {
            tempList.add(list.get(i));
        }
        tempList.add(element);
        for (int i = index; i < list.size(); i++) {
            tempList.add(list.get(i));
        }
        list = tempList;
    }
}
