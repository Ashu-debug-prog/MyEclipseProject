package logic;

import java.util.Scanner;
import java.util.Stack;

public class palindrome 
{
	public static boolean ispalindrome(String str) 
	{
		Stack<Character>stack=new Stack<>();
		
		for(char c: str.toCharArray())
		{
			stack.push(c);
		}
		for(char c:str.toCharArray()) 
		{
			if(c!=stack.pop())
			{
				return false;
				
			}
		}return true;
					
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter name");
		String ch=sc.next();
		if(ispalindrome(ch)) {
			System.out.println("Sting is palindrome");
			
		}
		else {
			System.out.println("not");
		}
	}
	
		

	}
