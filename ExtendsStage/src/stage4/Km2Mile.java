package stage4;

public class Km2Mile extends Converter{

	double mile;
	
	public Km2Mile(double mile) {
		this.mile = mile;
	}
	
	@Override
	protected double convert(double src) {
		double result = src / mile;
		return result;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
