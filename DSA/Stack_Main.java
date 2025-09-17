package Day1;

import java.util.Scanner;





 class Stack_Class
{
int tos,Maxsize,s[];

Stack_Class(int size)
{
tos=-1;
Maxsize=size;
s=new int[Maxsize];
}

void push(int e)
{
tos++;
s[tos]=e;
}
//s[++tos]=e; }
boolean isFull()
{
return (tos==Maxsize-1);
}
int pop()
{
int temp=s[tos];
tos--;
return(temp);
}
//return(s[tos--]); }
int peek()
{
return(s[tos]);
}
boolean isEmpty()
{
return (tos==-1);
}
void printStack()
{
for(int i=tos;i>-1;i--)
{
System.out.println(s[i]);
}
}
}
public class Stack_Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter stack size: ");
int size = sc.nextInt();
Stack_Class stack = new Stack_Class(size);
int choice, element;

do {
    System.out.println("\n====== Stack Menu ======");
    System.out.println("1. Push");
    System.out.println("2. Pop");
    System.out.println("3. Peek");
    System.out.println("4. Print Stack");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");
    choice = sc.nextInt();

    switch (choice) {
        case 1: // Push
            if (stack.isFull()) {
                System.out.println("⚠️ Stack is Full. Cannot push.");
            } else {
                System.out.print("Enter element to push: ");
                element = sc.nextInt();
                stack.push(element);
                System.out.println("✅ Element pushed.");
            }
            break;

        case 2: // Pop
            if (stack.isEmpty()) {
                System.out.println("⚠️ Stack is Empty. Cannot pop.");
            } else {
                System.out.println("✅ Popped element: " + stack.pop());
            }
            break;

        case 3: // Peek
            if (stack.isEmpty()) {
                System.out.println("⚠️ Stack is Empty. No top element.");
            } else {
                System.out.println("👀 Top element: " + stack.peek());
            }
            break;

        case 4: // Print Stack
            if (stack.isEmpty()) {
                System.out.println("⚠️ Stack is Empty. Nothing to display.");
            } else {
                System.out.println("📜 Stack contents (Top to Bottom):");
                stack.printStack();
            }
            break;

        case 5: // Exit
            System.out.println("👋 Exiting program. Thank you!");
            break;

        default:
            System.out.println("❌ Invalid choice. Please try again.");
    }

} while (choice != 5);

sc.close();
}
}