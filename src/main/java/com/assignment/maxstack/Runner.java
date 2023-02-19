package com.assignment.maxstack;

public class Runner {

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        //maxStack.peek();
        maxStack.push(19);
        maxStack.push(7);
        maxStack.push(10);

        maxStack.peek();
        System.out.println("////");
        maxStack.pop();
        System.out.println("////");
        maxStack.peek();
        System.out.println("////");
        maxStack.pop();
    }
}
