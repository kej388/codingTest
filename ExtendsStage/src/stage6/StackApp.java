package stage6;

import java.util.Scanner;

public class StackApp implements Stack{
	
	String top;
	String[] stack;
	int size;
	int count;
	String str;
	
	public StackApp(int size) {
		this.size = size;
		stack = new String[size - 1];
		top = null;
		count = -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = sc.nextInt();
		StackApp sa = new StackApp(size);
		while(true) {
			
			System.out.print("문자열 입력 >> ");
			sa.top = sc.next();
			if(sa.top.equals("그만")) {
				break;
			}
			if(sa.push(sa.top)) {
				sa.stack[sa.length()] = sa.top;
			} else {
				System.out.println("스택이 꽉 차서 푸시 불가!");
				continue;
			}

			sa.capacity();
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i = 0; i < sa.stack.length; i++) {
			System.out.print(sa.stack[i] + " ");
		}
		
	}

	@Override
	public int length() {
		count++;
		return count;
	}

	@Override
	public int capacity() {
		size--;
		return size;
	}

	@Override
	public String pop() {
		
		
		return str;
	}

	@Override
	public boolean push(String val) {
		
		if(size <= 0) {
			return false;
		}
		
		return true;
	}
}
