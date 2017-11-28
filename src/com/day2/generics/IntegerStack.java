package com.day2.generics;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>();

    public IntegerStack() {
    }

    public void push(int i) {
        this.data.addFirst(i);
    }

    public int pop() {
        return this.data.getFirst();
    }

    public int peek() {
        return this.data.peekFirst();
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}
