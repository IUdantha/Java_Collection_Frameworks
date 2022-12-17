package ArrayList;

public class demo {

	public static void main(String[] args) {
		
		ArrayListClass alc = new ArrayListClass();
		
		alc.addchar('c');
		alc.addchar('d');
		alc.addchar('A');
		alc.addchar('Z');
		alc.addchar('d');
		
		System.out.println("The size : " + alc.arrSize());
		alc.printArr();
		
		

		alc.addchartoIndex(3, 'L');
		alc.removechar(4);
		
		System.out.println("The size after remove : " + alc.arrSize());
		
		alc.printArr();
		

	}
	
	

}
