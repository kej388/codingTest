package chap02;

import java.util.Scanner;

public class ReverseArray {
	//배열 요소에 값을 읽어 들여 역순으로 정렬합니다.
	
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t; 
	}
	
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {	
		int[] num = {5, 10, 73, 2, -5, 42};	// 요솟수
		
		int len = num.length;
		
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j]+" ");
		}
		
		for(int i = 0; i < len / 2; i++) {
			
			
			System.out.println("\na[" + num[i] + "]과 a[" + (num.length - i - 1) + "]를 교환합니다.");
			
			swap(num, i, num.length - i - 1);
			
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j]+" ");
			}
		}
		
		System.out.println("\n역순 정렬을 마쳤습니다.");
	}
}
