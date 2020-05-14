package chap02;

import java.util.Scanner;

public class ArrayEqual00 {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수: ");
		int num = sc.nextInt();
		
		int[] b = new int[num];
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		int[] a = new int[num];
		
		copy(a, b);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		sc.close();
	}
}
