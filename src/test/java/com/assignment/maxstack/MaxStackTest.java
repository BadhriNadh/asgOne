package com.assignment.maxstack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {
//    @Test
//    public void createStackTest(){
//        MaxStack maxStack = new MaxStack();
//        assertNotNull(maxStack.stack());
//    }

    @Test
    public void pushToEmptyStackTest(){
        MaxStack maxStack = new MaxStack();
        var node = new Node();
        maxStack.push(node, 10);
        assertEquals(10, node.next.data);
    }

    @Test
    public void pushToStackTest(){
        MaxStack maxStack = new MaxStack();
        var stack = new Node();
        var element0 = new Node();
        var element1 = new Node();
        stack.next = element1;
        element1.data = 10;
        element1.next = element0;
        element0.data = 20;
        maxStack.push(stack,5);
        assertEquals(5,stack.next.data);
    }

    @Test
    public void peekStackTest(){
        MaxStack maxStack = new MaxStack();
        var stack = new Node();
        var element0 = new Node();
        var element1 = new Node();
        stack.next = element1;
        element1.data = 10;
        element1.next = element0;
        element0.data = 20;
        assertEquals(10,maxStack.peek(stack));
    }


    @Test()
    public void popTest(){
        MaxStack maxStack = new MaxStack();
        var stack = new Node();
        var element0 = new Node();
        var element1 = new Node();
        var element2 = new Node();
        var element3 = new Node();
        stack.next = element3;
        element3.data = 75;
        element3.next = element2;
        element2.data = 30;
        element2.next = element1;
        element1.data = 50;
        element1.next = element0;
        element0.data = 60;

        maxStack.pop(stack);
        Node node = stack.next;
        do{
            assertNotEquals(75,node.data);
            node = node.next;
        }while (node.next != null);
    }

    @Test()
    public void popLastElementMaxTest(){
        MaxStack maxStack = new MaxStack();
        var stack = new Node();
        var element0 = new Node();
        var element1 = new Node();
        var element2 = new Node();
        var element3 = new Node();
        stack.next = element3;
        element3.data = 75;
        element3.next = element2;
        element2.data = 30;
        element2.next = element1;
        element1.data = 50;
        element1.next = element0;
        element0.data = 80;

        maxStack.pop(stack);
        Node node = stack.next;
        do{
            assertNotEquals(80,node.data);
            node = node.next;
        }while (node.next != null);
        assertNotEquals(80,node.data);
    }
}