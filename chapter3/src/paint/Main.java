package paint;

public class Main {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setX(50);
		drawPoint(point);

	}
	
	public static void drawPoint(Point point) {
		point.show();
	}

}
