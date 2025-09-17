package dsa_Day4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class linkeListusingstack {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
		System.out.print("Enter element #" + (i + 1) + ": ");
		list.add(sc.nextInt());
		}

		System.out.println("Original LinkedList: " + list);

		while (!list.isEmpty()) {
		stack.push(list.remove(0));
		}

		while (!stack.isEmpty()) {
		list.add(stack.pop());
		}

		System.out.println("Reversed LinkedList: " + list);

	}
}


