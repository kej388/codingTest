package stage9;

public class Seat {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		if(name == null) {
			name = "---";
		}
		
		return name;
	}
	
	public void checkCancle(String a) {
		if(name.equals(a)) {
			name = "---";
		}
	}
}
