package com.assignment.maxstack;

public class MaxStack {

    //Node topPointer = new Node();

    public Node stack(){
        return new Node();
    }

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

        //return head;
    }

//    public void push(int data){
//
//        Node node = new Node();
//
//        if(topPointer.next == null) {
//            node.data = data;
//            node.next = null;
//            topPointer.next = node;
//        } else {
//            node.data = data;
//            node.next = topPointer.next;
//            topPointer.next = node;
//        }
//    }

    public int peek(Node head) throws NullPointerException {
        return head.next.data;
    }

    public void peekAll(Node stack) {
        Node node = stack.next;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


        public void pop(Node stack){

        // Finding max
        Node node = stack.next;
        int max = node.data;
        while (node.next != null){
            if(node.data > max){
                max = node.data;
            }
            node = node.next;
        }
        if(node.data > max){
            max = node.data;
        }

        // Remove max
        Node prePointer = stack;
        node = stack.next;
        while(node.next != null){
            if(node.data == max){
                prePointer.next = node.next;
            }else{
                prePointer = node;
            }
            node = node.next;
        }

        if(node.data == max){
            prePointer.next = null;
        }

    }

//    private void popMax(int max){
//        Node prePointer = topPointer;
//        Node node = topPointer.next;
//
//        do {
//            if(node.data == max){
//                prePointer.next = node.next;
//                //Delete object?
//            }else{
//                prePointer = node;
//            }
//            node = node.next;
//        } while(node.next != null);
//
//    }
}
