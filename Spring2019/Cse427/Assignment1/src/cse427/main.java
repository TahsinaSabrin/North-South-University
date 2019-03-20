package cse427;

import java.util.Stack;

import org.junit.Before;

public class main {

	public static void main(String[] args) {
	
		Stack s1=new Stack();
	s1.push(1);
	s1.push("i");
	s1.push(2.5);
	s1.push("hg");
	
	
	System.out.println("after pushing "+s1);
	s1.pop();
	s1.pop();
	System.out.println("After poping "+s1);
	Stack s2=new Stack();
	
	

System.out.println("for new empty stack "+s2.isEmpty());
	}

}
