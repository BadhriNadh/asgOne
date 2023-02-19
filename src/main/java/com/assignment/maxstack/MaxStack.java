package com.assignment.maxstack;

public class MaxStack {

    Node topPointer = new Node();

    public void push(int data){

        Node node = new Node();

        if(topPointer.next == null) {
            node.data = data;
            node.next = null;
            topPointer.next = node;
        } else {
            node.data = data;
            node.next = topPointer.next;
            topPointer.next = node;
        }
    }

    public void peek(){
        Node node = topPointer.next;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void pop(){

        //Finding max
        int max = topPointer.data;
        Node node = topPointer.next;
        do{
            if(node.data > max){
                max = node.data;
            }
            node = node.next;
        }while (node.next != null);

        System.out.println(max);
        popMax(max);

    }

    private void popMax(int max){
        Node prePointer = topPointer;
        Node node = topPointer.next;

        do {
            if(node.data == max){
                prePointer.next = node.next;
                //Delete object?
            }else{
                prePointer = node;
            }
            node = node.next;
        } while(node.next != null);

    }
}
