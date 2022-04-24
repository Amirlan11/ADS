package com.company;

public class MyStack<T>  {
    private Node<T> head;
    private static class Node<T>{
        private T value;
        private Node<T>  next;
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
    public T peek(){
        return head.value;
    }
    public T pop(){
        T value = head.value;
        head=head.next;
        return value;
    }
    public void push(T t){
        Node<T> node = new Node<>(t);
        node.next=head;
        head = node;

    }
    public boolean contain(){
        return head== null;
    }



}
