package Stack_Collection;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();
		
		//add items to stack
		myStack.add("Isuru");
		myStack.add("Udantha");
		myStack.push("Gunathilaka");
		myStack.add("Apple");
		myStack.add("ZZZZ");
		
		Collections.sort(myStack);
		System.out.println("The stack is : " + myStack);
		
		//stack follow LIFO principal
		//remove item from stack
		myStack.pop();
		
		System.out.println("The stack is : " + myStack);
		
		//remove another item from stack
		myStack.pop();
		
		System.out.println("The stack is : " + myStack);
		

	}

}
