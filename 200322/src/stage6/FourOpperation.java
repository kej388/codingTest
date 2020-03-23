package stage6;

import java.util.Scanner;

class Add {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		int result = a + b;
		return result;
	}
}

class Sub {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		int result = a - b;
		return result;
	}
}

class Mul {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		int result = a * b;
		return result;
	}
}

class Div {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		int result = a / b;
		return result;
	}
}

public class FourOpperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하시오>>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char sign = sc.next().charAt(0);
		
		sc.close();
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		int result = 0;
		
		if(sign == '+') {
			add.setValue(a, b);
			result = add.calculate();
		} else if(sign == '-') {
			sub.setValue(a, b);
			result = sub.calculate();
		} else if(sign == '*') {
			mul.setValue(a, b);
			result = mul.calculate();
		} else if(sign == '/') {
			div.setValue(a, b);
			result = div.calculate();
		}
		
		System.out.println(result);
		
	}
	
}
