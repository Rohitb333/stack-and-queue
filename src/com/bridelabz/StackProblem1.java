package com.bridelabz;

public class StackProblem1 {
    static class Node {
        int data;
        StackProblem.Node next;

        // create constructor for Node Class
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static StackProblem.Node head;

        // function isEmpty()
        public static boolean isEmpty() {

            return head == null;
        }

        public static void push(int data) {
            StackProblem.Node newNode = new StackProblem.Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static void main(String[] args) {
            StackProblem.Stack stack = new StackProblem.Stack();
            System.out.println("The Result of Stack is : ");
            System.out.println("===========================");
            StackProblem.Stack.push(1);
            StackProblem.Stack.push(2);
            StackProblem.Stack.push(3);
            StackProblem.Stack.push(4);

            while (!StackProblem.Stack.isEmpty()) {
                System.out.println(StackProblem.Stack.peek());
                stack.pop();
            }
        }
    }
}