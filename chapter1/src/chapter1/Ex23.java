package chapter1;

public class Ex23 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(true) {
			if(sum > 5000) {
				break;
			}
			
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("i:" + i);
		System.out.println("sum:" + sum);

	}

}
