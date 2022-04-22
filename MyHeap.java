package com.company;


public class MyHeap <T>{
    private Object[] HeapArray;
    private int capacity;
    private int length;

    private int getLeftChildIndex(int i) {
        return 2 * i;
    }

    private int getRightChildIndex(int i) {
        return ((2 * i) + 1);
    }

    private int getParentIndex(int i) {
        return i / 2;
    }

    private void swapNodes(int fpos, int spos) {
        Object temp;
        temp = HeapArray[fpos];
        HeapArray[fpos] = HeapArray[spos];
        HeapArray[spos] = temp;
    }



}
