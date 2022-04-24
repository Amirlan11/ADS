package com.company;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private static class Node<T>{
        private T value;
        private Node<T> next;
        public Node(T value){
            this.value= value;
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode=head;
        while (currentNode!=null){
            sb.append(currentNode.value);
            currentNode=currentNode.next;
        }
        return sb.toString();
    }
    public void enqueque(T t){
        Node<T> node = new Node<>(t);
        if(head == null){
            head=node;
        }
        if(tail!= null){
            tail.next=node;
        }
        tail=node;
    }
    public void dequeque(){
        head = head.next;
        if (head == null){
            tail=null;
        }

    }
    public T peek(){
        return head.value;
    }


}
