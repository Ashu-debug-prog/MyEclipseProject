package LinkList;

import java.util.Scanner;

public class Queue_Circular_Linked {
	
	
	    class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node front = null;
	    private Node rear = null;

	    // Insert at front (left)
	    void insertLeft(int data) {
	        Node newNode = new Node(data);
	        if (front == null) {
	            front = rear = newNode;
	            rear.next = front; // make it circular
	        } else {
	            newNode.next = front;
	            front = newNode;
	            rear.next = front;
	        }
	        System.out.println(data + " inserted at left.");
	    }

	    // Insert at rear (right)
	    void insertRight(int data) {
	        Node newNode = new Node(data);
	        if (rear == null) {
	            front = rear = newNode;
	            rear.next = front;
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	            rear.next = front;
	        }
	        System.out.println(data + " inserted at right.");
	    }

	    // Delete from front (left)
	    void deleteLeft() {
	        if (front == null) {
	            System.out.println("Queue is empty.");
	        } else if (front == rear) { // Only one node
	            System.out.println(front.data + " deleted from left.");
	            front = rear = null;
	        } else {
	            System.out.println(front.data + " deleted from left.");
	            front = front.next;
	            rear.next = front;
	        }
	    }

	    // Display the circular queue
	    void display() {
	        if (front == null) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Circular Queue: ");
	        Node temp = front;
	        do {
	            System.out.print("| " + temp.data + " | -> ");
	            temp = temp.next;
	        } while (temp != front);
	        System.out.println("(back to front)");
	    }

	    // Menu to test
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Queue_Circular_Linked queue = new Queue_Circular_Linked();
	        int choice, value;

	        do {
	            System.out.println("\n--- Circular Queue Menu ---");
	            System.out.println("1. Insert Left");
	            System.out.println("2. Insert Right");
	            System.out.println("3. Delete Left");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert at left: ");
	                    value = sc.nextInt();
	                    queue.insertLeft(value);
	                    break;
	                case 2:
	                    System.out.print("Enter value to insert at right: ");
	                    value = sc.nextInt();
	                    queue.insertRight(value);
	                    break;
	                case 3:
	                    queue.deleteLeft();
	                    break;
	                case 4:
	                    queue.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 5);

	        sc.close();
	    }
	}
