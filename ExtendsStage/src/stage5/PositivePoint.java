package stage5;

public class PositivePoint extends Point{

	public PositivePoint() {
		super(0, 0);
	}
	
	public PositivePoint(int x, int y) {
		this();
	}
	
	public String toString() {
		
		int a = this.getX();
		int b = this.getY();
		
		return "(" + a + "," + b + ")의 점";
	}
	
	@Override
	protected void move(int x, int y) {
		if(x > 0 || y > 0) {
			
		}
		super.move(x, y);
	}
	
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
	
}
