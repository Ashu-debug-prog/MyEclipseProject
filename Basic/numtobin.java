package logic;

import java.util.Scanner;
import java.util.Stack;

public class numtobin {
	public static void conbin(int num) {
		Stack<Integer> stack=new Stack<>();
		while(num>0) {
			stack.push(num%2);
			num=num/2;
			}
		System.out.println("Binary: ");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		conbin(number);

	}

}
