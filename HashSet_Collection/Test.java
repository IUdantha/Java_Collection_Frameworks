package HashSet_Collection;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> myHS = new HashSet<>();

		// add items to stack
		myHS.add("Gunathilaka");
		myHS.add("Isuru");
		myHS.add("Isuru");
		myHS.add("Udantha");
		myHS.add("Gunathilaka");

		System.out.println("The HashSet is : " + myHS);

	}

}
