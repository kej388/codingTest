package chap02;

import java.util.Scanner;

public class ArrayEqual01 {
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[a.length - i - 1] = b[i];
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
		
		rcopy(a, b);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		sc.close();
	}
}
