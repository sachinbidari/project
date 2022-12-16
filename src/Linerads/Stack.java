package Linerads;

public class Stack 
{
   static  int cap=5,top=-1;
   static  int stack[]=new int[cap];
    public static boolean isFull()
    {
    	if(top==cap-1)
    		return true;
    	else
    		return false;
    }
    public static boolean isEmpty()
    {
    	if(top==-1)
    		return true;
    	else
    		return false;
    }
    public static void push(int ele)
    {
    	if(isFull())
    		System.out.println("stack is full");
    	else
    	{
    		top++;
    		stack[top]=ele;
    	}
    }
    public static void pop()
    {
    	if(isEmpty())
    		System.out.println("stack is empty");
    	else
    	{
    		System.out.println(stack[top]+" deleted");
    		top--;
    	}
    }
    public static void peek()
    {
    	if(isEmpty())
    		System.out.println("stack is empty");
    	else
    	{
    		System.out.println(stack[top]);
    		
    	}
    }
    public static void display()
    {
    	if(isEmpty())
    		System.out.println("stack is empty");
    	else
    	{
    		for(int i=top;i>=0;i--)
    			System.out.println(stack[i]);
    	}
    }
    public static void main(String[] args) {
    	push(10);
    	push(20);
    	push(30);
    	push(40);
    	peek();
    	push(50);
    	push(60);
    	display();
	}
}

