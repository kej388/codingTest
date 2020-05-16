package chap02;

import java.util.Scanner;

// 두 배열이 같은가를 판단
public class ArrayEqual {
	// 두 배열 a, b의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < b.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수: ");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수: ");
		num = sc.nextInt();
		
		int[] b = new int[num];
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		if(equals(a, b)) System.out.println("배열 a와 배열 b는 같습니다.");
		else System.out.println("배열 a와 배열 b는 다릅니다.");
		
		
		
		sc.close();
	}
}
