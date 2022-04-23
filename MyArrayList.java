package com.company;

public class MyArrayList<T> implements MyList {

    private int length = 0;
    private int capacity = 3;
    private Object[] arr = new Object[capacity];

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size(); i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object item) {
        if (length == capacity) {
            increaseCapacity();
        }

        this.arr[length++] = item;
    }

    private void increaseCapacity() {
        capacity = 2 * capacity;

        arr = new Object[capacity];

        Object[] old = arr;


        for (int i = 0; i < old.length; i++)
            arr[i] = old[i];
    }


    @Override
    public void add(Object item, int index) {
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = (int) arr[i];
        }

        result[index] = (int) item;

        for (int i = index + 1; i <= arr.length; i++) {
            result[i] = (int) arr[i - 1];
        }
    }

    @Override
    public boolean remove(Object item) {

        for (int i = 0; i < size(); i++) {
            if (arr[i].equals(item)) {
                arr[i] = null;
                return true;
            }
        }

        return false;
    }

    @Override
    public T remove(int index) {
        // if empty
        if (arr == null || index < 0 || index >= arr.length) {
            return (T) arr;
        }
        // creating another array one less than initial array
        Object[] newArray = new Object[arr.length - 1];
        // copying elements except index
        for (int a = 0, b = 0; a < arr.length; a++) {
            if (a == index) {
                continue;
            }
            newArray[b++] = (int) arr[a];
        }

        arr = newArray.clone();
        return (T) arr;

    }

    @Override
    public void clear() {
        length = 0;
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o)) {
                index = i;
            }
        }
        return index;
    }


    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
