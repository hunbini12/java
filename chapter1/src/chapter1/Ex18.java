package chapter1;

public class Ex18 {

	public static void main(String[] args) {
		final int POWER = 10;
		int result = 1;
		
		int i = 0;
		while(i < POWER) {
			result *= 2;
			i = i + 1;
		}
		
		System.out.println("2의 " + POWER + "승은 " + result + "입니다.");

	}


	}