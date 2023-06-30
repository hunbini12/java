package Chapter4;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point1 p = new Point1(10, 20);
		
		// Class klss = p.getClass();		
		System.out.println(p.getClass()); // reflection
		                                  // address 기반의 핵심값
		System.out.println(p.hashCode()); // address X
		                                  // reference X
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
		System.out.println(p);

	}

}
