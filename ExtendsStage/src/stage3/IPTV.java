package stage3;

public class IPTV extends ColorTV{
	
	String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ip +"주소의 " + this.getSize() + "인치 " + this.getColor() + "컬러");
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 1024);
		
		iptv.printProperty();
	}
}
