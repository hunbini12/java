package chapter1;

public class Ex22 {

	public static void main(String[] args) {
		//testFor();
		
		//while 문엣 continue 구문을 사용할 때는 조건 변경을 신경 써야한다.
		}
	
	public static void testFor() {
		for(int i = 0; i < 10; i++) {
			if(i % 2 !=0) {
				continue;
			}
			
			System.out.println(i);
		}
	}
	
	public static void testWhile() {
		int i = 0;
		while(i < 10) {
			if(i % 2 !=0) {
				continue;
			}
			
			System.out.println(i);
			i++;
		}
	}

}
