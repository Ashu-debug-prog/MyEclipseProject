package lab;

import java.util.Scanner;
import java.util.Stack;

public class revstr {
	
	

	public static void main(String[] args) {
		Stack<Character>s=new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word=sc.next();
		 for(int i=0;i<word.length();i++) {
			 s.push (word.charAt(i));
		 }
		 System.out.println("Stack contents (top to bottom): " + s);
		 if(!s.isEmpty()) {
			 System.out.println("Top element"+s.peek());
		 }else {
			 System.out.println("Stack is empty");
		 }
		 String revword="";
		 while(!s.isEmpty())
		 {
			 revword+=s.pop();
		 }
		 System.out.println("Reversed Word: " + revword);

	}

}
