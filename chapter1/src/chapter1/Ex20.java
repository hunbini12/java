package chapter1;

public class Ex20 {

	public static void main(String[] args) {
		final int LOOP_COUNT = 10;
		
		int i = 0;
		
		do {
			System.out.println(i+ ". hello");
			i = i + 1;
		} while(i < LOOP_COUNT);

	}

}
