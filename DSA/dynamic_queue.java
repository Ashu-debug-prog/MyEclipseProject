package LinkList;

import java.util.Scanner;
//most askked in interview
public class dynamic_queue {
	

	    class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	  
	    class Queue {
	        Node front = null, rear = null;

	        void enqueue(int data) {
	            Node newNode = new Node(data);
	            if (rear == null) {
	                front = rear = newNode;
	            } else {
	                rear.next = newNode;
	                rear = newNode;
	            }
	            System.out.println(data + " enqueued.");
	        }

	        void dequeue() {
	            if (front == null) {
	                System.out.println(" Queue is empty.");
	            } else {
	                System.out.println(front.data + " dequeued.");
	                front = front.next;
	                if (front == null) rear = null; 
	            }
	        }

	        void peek() {
	            if (front == null) {
	                System.out.println("Queue is empty.");
	            } else {
	                System.out.println("Front element is: " + front.data);
	            }
	        }

	        void display() {
	            if (front == null) {
	                System.out.println("Queue is empty.");
	            } else {
	                System.out.print("Queue elements: ");
	                Node temp = front;
	                while (temp != null) {
	                    System.out.print("| " + temp.data + " | -> ");
	                    temp = temp.next;
	                }
	                System.out.println("null");
	            }
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        dynamic_queue outer = new dynamic_queue(); 
	        Queue queue = outer.new Queue(); 

	        int choice, value;

	        do {
	            System.out.println("\n--- Queue Menu ---");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to enqueue: ");
	                    value = sc.nextInt();
	                    queue.enqueue(value);
	                    break;
	                case 2:
	                    queue.dequeue();
	                    break;
	                case 3:
	                    queue.peek();
	                    break;
	                case 4:
	                    queue.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 5);

	        sc.close();
	    }
	}


