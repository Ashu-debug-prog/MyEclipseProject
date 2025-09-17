package lab;

import java.util.Scanner;

public class Reverse_String {
	int maxsize,top;
	char stack[];
	
	void createstack(int size)
	{
		maxsize=size;
		top=-1;//initiall stack should be empty
		stack=new char[maxsize];
	}
	void push( char e)
	{
		top++;
		stack[top]=e;
		
	}
	
	boolean isfull()
	{
		if(top==maxsize-1)
			return true;
		else
			return false;
	}
	
	
	
	char pop()	
		{
			char temp=stack[top];
			top--;
			return(temp);
		}
	boolean isEmpty() 
	{
		if(top==-1)
			return true;
		else
			return false;
		
	
	}
	void print_stack()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Word");
		String word=sc.next();
		Reverse_String obj=new Reverse_String();
		obj.createstack(word.length());
		 for(int i=0;i<word.length();i++)// and push in stack
	        {
	            obj.push(word.charAt(i));
	        }
		 String revword="";
		 while (obj.isEmpty()!=true)
		 {
			 revword=revword+obj.pop();
		 }
		 System.out.println("Reverse :"+revword);

	}

}
