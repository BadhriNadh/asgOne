package com.assignment.maxstack;

public class MaxStack {
    public Node stack(){ return new Node(); }

    public void push(Node head, int value){

        Node node = new Node();

        if(head.next == null) {
            node.data = value;
            node.next = null;
            head.next = node;
        } else {
            node.data = value;
            node.next = head.next;
            head.next = node;
        }
    }

    public int peek(Node head) throws NullPointerException { return head.next.data; }

    public void pop(Node stack){

        // Finding max
        Node node = stack.next;
        int max = node.data;
        while (node.next != null){
            if(node.data > max){ max = node.data; }
            node = node.next;
        }
        if(node.data > max){ max = node.data; }

        // Remove max
        Node prePointer = stack;
        node = stack.next;
        while(node.next != null){
            if(node.data == max){ prePointer.next = node.next; }
            else{ prePointer = node; }
            node = node.next;
        }
        if(node.data == max){ prePointer.next = null; }
    }
}
