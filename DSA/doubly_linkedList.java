package Assingment;

import java.util.Scanner;

public class doubly_linkedList {
	class Node
	{
		int data;
		Node prev, next;
		
		Node(int data)
		{
			this.data=data;
			this.prev=prev;
			this.next=next;
			
		}

	}
	Node head, tail;
	void addFirst(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
			head=tail=newNode;
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	void addLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
			head=tail=newNode;
		else
		{
			newNode.prev=tail;
			tail.next=newNode;
			tail=newNode;
			
		}
	}
	void removeFirst()
	{
		if(head==null)
		{
			System.out.println("Link list is empty");
			return;
			
			
		}
		Node temp=head;
		head=head.next;
		if(head!=null)
			head.prev=null;
		else
			tail=null;
		temp.next=null;
	
	}
	void removeLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node temp=head;
		head=head.next;
		if(head!=null)
			head.prev=null;
		else
			tail=null;
		temp.next=null;
		temp.prev=null;
	
	}
	void printDoubly() {
		Node temp=head;
		while(temp!=null)
		{

			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 doubly_linkedList dll = new doubly_linkedList();
	        int num;

	        do {
	            System.out.println("\n1. InsertLeft");
	            System.out.println("2. InsertRight");
	            System.out.println("3. RemoveFirst");
	            System.out.println("4. RemoveLast");
	            System.out.println("5. PrintList");
	            System.out.println("6. Exit");
	            System.out.print("Please Enter the Choice = ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the value you want to insert on left = ");
	                    num = sc.nextInt();
	                    dll.addFirst(num);
	                    break;

	                case 2:
	                    System.out.print("Enter the value you want to insert on right = ");
	                    num = sc.nextInt();
	                    dll.addLast(num);
	                    break;

	                case 3:
	                    dll.removeFirst();
	                    break;

	                case 4:
	                    dll.removeLast();
	                    break;

	                case 5:
	                    dll.printDoubly();
	                    break;

	                case 6:
	                    System.out.println("Exiting the program");
	                    return;

	                default:
	                    System.out.println("Invalid Choice .....!!!");
	            }
	        } while (true);
	    }


	}


