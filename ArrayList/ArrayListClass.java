package ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	private ArrayList <Character> arr = new ArrayList<>();

	public void addchar(char letter) {
		arr.add(letter);
	}
	
	public void removechar(int num) {
		arr.remove(num);
	}
	
	public void addchartoIndex(int num, char letter) {
		arr.add(num, letter);
	}
	
	public int arrSize() {
		int size = arr.size();
		return size;
	}
	
	public void printArr() {
		System.out.println(arr);
		
	}
}
