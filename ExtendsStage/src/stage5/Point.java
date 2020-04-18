package stage5;

public class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		if(x > 0 && y > 0) {
		this.x = x; this.y = y;
		}
	}
}
