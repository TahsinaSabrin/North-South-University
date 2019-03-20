package cse427;

import java.util.Arrays;
import java.util.Stack;

public class GenericStack {
	 private Object  stack [];
	    private int top; 
	    int size;
	    public GenericStack() 
		   {
	    	
		   }
		   
	    public GenericStack(int SIZE) 
	   {
	    stack = new Object [SIZE];
	    top = -1;
}
	    
	   public Object push(Object i) 
	    {
	        if (top == stack.length)
	        {
	            extendStack();
	        }

	           stack[top]= (Object) i;
	            top++;
	            return i;
	            
	            
	    }
	    
	    public boolean isEmpty() 
	    {
	        return(size==0);
	    }
	    public Object pop() 
	    {
	        top --;
	       
	        return stack[top];
	    }
	   
	   
	    

private void extendStack()
{

    Object[] copy = Arrays.copyOf(stack, stack.length);
}


public  void define(Object t) {
	 if (top == stack.length)
     {
         extendStack();
     }
	for(int i=0;i<stack.length;i++)
		stack[i]= (Object) t;
	Object number = 0-9;
	Object alphebet ="A-Z";
	
	if(t == number) 
		
	{
	
	System.out.println("integer");	
	}
	
	else if(t == alphebet) {
	System.out.println("String");
	}
	

	



	
		
}

public String size() {
	
	return "size";
}


}