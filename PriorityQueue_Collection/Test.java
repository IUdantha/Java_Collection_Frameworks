package PriorityQueue_Collection;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String> myPQ = new PriorityQueue<>();

		// add items to stack
		myPQ.add("Isuru");
		myPQ.add("Udantha");
		myPQ.add("Gunathilaka");
		myPQ.add("Ramani");
		myPQ.add("Kamal");

		System.out.println("The Priority Queue is : " + myPQ);
		System.out.println("The Priority Queue peek is : " + myPQ.peek());

		// remove item from stack
		System.out.println("The Priority Queue poll is : " + myPQ.poll());
		System.out.println("The Priority Queue is : " + myPQ);
		
		System.out.println("The Priority Queue poll is : " + myPQ.poll());
		System.out.println("The Priority Queue is : " + myPQ);
	}

}
