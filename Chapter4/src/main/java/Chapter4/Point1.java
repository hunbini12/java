package Chapter4;

import java.util.Objects;

public class Point1 {
	private int x;
	private int y;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point1 other = (Point1) obj;
		return x == other.x && y == other.y;
	}
}