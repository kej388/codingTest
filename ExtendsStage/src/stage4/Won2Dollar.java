package stage4;

public class Won2Dollar extends Converter{
	
	int price;
	
	public Won2Dollar(int price) {
		this.price = price;
	}

	@Override
	protected double convert(double src) {
		
		double result = src / price;
		
		return result;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); //1달러는 1200원
		toDollar.run();
	}
}
