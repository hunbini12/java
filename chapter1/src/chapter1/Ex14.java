package chapter1;

public class Ex14 {

	public static void main(String[] args) {
		final int LOOP_COUNT = 10;
		
		// 1. Loop 조건 변수
		int i = 0;
		// 2. while loop 조건
		while(i < LOOP_COUNT){ // i = 
			// 3. 반복 코드
			System.out.print(i + ".hello");
			
			// 3. Loop 조건 변수를 변경
			i = i + 1;
		}

	}

}
