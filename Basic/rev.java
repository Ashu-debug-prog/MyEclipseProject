package logic;

import java.util.Scanner;
import java.util.Stack;

public class rev {
	static String reve(String word) 
	{
		String rev="";
		Stack<Character>stack=new Stack<>();
		for(char ch:word.toCharArray()) {
			stack.push(ch);
		}
		while(!stack.isEmpty()) 
		
			rev=rev+stack.pop();
		return rev;
		
		
	}
	 public static void main(String args[]) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter");
	 String wor=sc.next();
	 String rword=reve(wor);
	 System.out.println("Reversed word:"+rword);
	 }
		
	

}
