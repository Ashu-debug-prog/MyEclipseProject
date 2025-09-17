package lab;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	Queue<Integer> q = new LinkedList<>(); 
	
	void enqueue(int e)
	{
		q.add(e);
	}
	int dequeue()
	{
		return q.remove();
	}
	boolean isEmpty()
	{
		return q.isEmpty();
	}
	void printStack()
	{
		System.out.println("Queue has:"+q);
	}
	
	public static void main(String[] args) 
	{
		Queue1 qu=new Queue1();
		//enqueue
		qu.enqueue(10);
		qu.enqueue(12);
		qu.enqueue(15);
		
		qu.printStack();
		
		while(!qu.isEmpty())
		{
			System.out.println("Dequeue:"+qu.dequeue());
		}
		
		System.out.println("Queue after removing ecery thing");
		qu.printStack();
		
	}

}
