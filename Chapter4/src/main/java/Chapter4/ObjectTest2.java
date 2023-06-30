package Chapter4;

public class ObjectTest2 {
	public static void main(String[] args) {
		Point1 p1 = new Point1(10, 20);
		Point1 p2 = new Point1(10, 20);
		Point1 p3 = p2;
		
		// == : 두 객체의 동일성
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);

		// equals : 두 객체의 동질성(내용비교)
		//          부모 클래스 Object 
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
	}

}
