package com.company;

public class MyStack<T> {
    private int length;
    private int SizeOfStack;
    public Object[] arr;
    public MyStack() {
        SizeOfStack = 10;
        arr = new Object[SizeOfStack];
        length = 0;
    }

    public void push(T item) {
        if (length == SizeOfStack) {
            increaseCapacity();
        }
        arr[length] = item;
        length++;
    }

    public boolean empty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public T peek() {
        if (!empty()) {
            return (T) arr[length];
        }
        return (T) "The Stack is empty";
    }

    public T pop() {
        if (empty()) return (T) "The Stack is empty";

        length--;
        return (T) arr[length];
    }

    private void increaseCapacity() {
        SizeOfStack = 2 * SizeOfStack;
        Object[] old = arr;
        arr = new Object[SizeOfStack];
        for (int i = 0; i < old.length; i++)
            arr[i] = old[i];
    }



}
