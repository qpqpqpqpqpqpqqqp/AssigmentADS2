package com.company;

public class Main {

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        MyQueue<Integer> white = new MyQueue<>();
        MyHeap<Integer> chan = new MyHeap<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Size of ur stack " + stack.size());

        System.out.println("I am deleting " + stack.pop());

        System.out.println("Size of ur stack " + stack.size());

//        white.push(1);
//        white.push(2);
//        white.push(3);
//        white.push(4);
//        white.push(5);
//
//        System.out.println(white.popQ());
//
//        white.push(1);
//
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.arr[i]+" ");
        }


    }
}
