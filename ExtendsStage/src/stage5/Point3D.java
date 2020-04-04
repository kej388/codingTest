package stage5;

public class Point3D extends Point{

	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public Point3D(int x, int y) {
		super(x, y);
		
	}
	
	public String toString() {
		
		int a = this.getX();
		int b = this.getY();
		
		return "(" + a + "," + b + "," + z + ")의 점";
	}
	
	public int moveUp () {	
		return z++;
	}
	
	public int moveDown() {
		return z--;
	}
	
	public void move(int x, int y, int z) {
		this.move(x, y);
		this.z = z;
	}
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}

}
