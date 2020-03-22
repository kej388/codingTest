package stage6;

import java.util.Scanner;

class Add {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		
		
		
		
		
		return 0;
	}
}

class Sub {
	int a, b;
	void setValue(int a, int b) {
		
	}
	
	int calculate() {
		return 0;
	}
}

class Mul {
	int a, b;
	void setValue(int a, int b) {
		
	}
	
	int calculate() {
		return 0;
	}
}

class Div {
	int a, b;
	void setValue(int a, int b) {
		
	}
	
	int calculate() {
		return 0;
	}
}

public class FourOpperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하시오>>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String sign = sc.next();
		
		sc.close();
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		
	}
	
}
