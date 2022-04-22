package com.company;

public class MyQueue <T>{

    private int length;
    private int bebra;
    public Object[] arr;

    public MyQueue() {

        bebra = 10;
        arr = new Object[bebra];
        length = 0;
    }

    public void push(T item) {

        if(length == bebra ) {

            increaseCapacity();

        }

        arr[length] = item;

        length++;

    }

    public boolean empty() {

        if (length == 0) {

            return true;

        }

        return false;

    }

    public int size() {

        return length;

    }

    public T peek() {

        if(empty() == false) {

            return (T) arr[length];

        }

        return (T) "The Stack is empty";

    }

    public T popQ() { //удаляет топовый элемент

        for (int i = 0; i < length / 2; i++) {
            Object temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }

        if(empty()) {

            return (T) "The Stack is empty";

        }

        length--;

        for (int i = 0; i < length / 2; i++) {
            Object temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }

        return  (T) arr[length];

    }



    private void increaseCapacity() {

        bebra = 2 * bebra;

        Object[] old = arr;

        arr = new Object[bebra];

        for (int i = 0; i < old.length; i++)

            arr[i] = old[i];

    }

    public T get(int index) {

        return (T)arr[index];

    }

}
