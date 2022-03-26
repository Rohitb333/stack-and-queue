package com.bridelabz;

public class QueueProblem1 {
    static class Node {
        int data;
        QueueProblem.Node next;

        //Create Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static QueueProblem.Node head = null;
        static QueueProblem.Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        //Enqueue - Add Element in Queue
        public static void add(int data) {
            QueueProblem.Node newNode = new QueueProblem.Node(data);

            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static void main(String[] args) {
            QueueProblem.Queue queue = new QueueProblem.Queue();
            System.out.println("The Result of Queue is : ");
            System.out.println("===========================");
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
        }

    }
}
