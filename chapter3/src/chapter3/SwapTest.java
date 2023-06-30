package chapter3;

public class SwapTest {

	public static void main(String[] args) {
		IntValue a = new IntValue(10);
		IntValue a = new IntValue(20);
		
		System.out.println("a:" +  a + ",b:" +  b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a:" +  a + ",b:" +  b);

	}
	
	public static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}

}
