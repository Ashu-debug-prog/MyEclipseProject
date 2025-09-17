package dsa_Day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import java.util.*;

public class LinkedListUsingDeque {
    Deque<Integer> deque;

    public LinkedListUsingDeque() {
        deque = new LinkedList<>();
    }

    // Insert at front (left)
    public void insertLeft(int data) {
        deque.addFirst(data);
        System.out.println(data + " inserted at left.");
    }

    // Insert at rear (right)
    public void insertRight(int data) {
        deque.addLast(data);
        System.out.println(data + " inserted at right.");
    }

    // Delete from front (left)
    public void deleteLeft() {
        if (!deque.isEmpty()) {
            int removed = deque.removeFirst();
            System.out.println(removed + " deleted from left.");
        } else {
            System.out.println("List is empty!");
        }
    }

    // Delete from rear (right)
    public void deleteRight() {
        if (!deque.isEmpty()) {
            int removed = deque.removeLast();
            System.out.println(removed + " deleted from right.");
        } else {
            System.out.println("List is empty!");
        }
    }

    // Display elements
    public void display() {
        if (deque.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Linked List: ");
        for (int val : deque) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListUsingDeque list = new LinkedListUsingDeque();
        int choice, data;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at left: ");
                    data = sc.nextInt();
                    list.insertLeft(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert at right: ");
                    data = sc.nextInt();
                    list.insertRight(data);
                    break;
                case 3:
                    list.deleteLeft();
                    break;
                case 4:
                    list.deleteRight();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
