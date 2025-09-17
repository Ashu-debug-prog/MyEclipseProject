package LinkList;
import java.util.Scanner;

public class stack_linked {

   
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

 
    class Stack {
        Node top = null; 

        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            System.out.println(data + " pushed to stack.");
        }

        void pop() {
            if (top == null) {
                System.out.println("Stack Underflow! Stack is empty.");
            } else {
                System.out.println(top.data + " popped from stack.");
                top = top.next;
            }
        }

        void peek() {
            if (top == null) {
                System.out.println("Stack is empty.");
            } else {
                System.out.println("Top element is: " + top.data);
            }
        }

        void display() {
            if (top == null) {
                System.out.println("Stack is empty.");
            } else {
                System.out.print("Stack elements: ");
                Node temp = top;
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
        stack_linked outer = new stack_linked(); // Outer class object
        Stack stack = outer.new Stack(); // Inner class object

        int choice, value;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break; 
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
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
