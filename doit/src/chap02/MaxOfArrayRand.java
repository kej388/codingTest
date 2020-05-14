package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	// 난수 사용해 배열의 요솟값 설정하기
	// 배열 a의 최댓값을 구하여 반환
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int player = rand.nextInt(10);	// 배열의 요솟수를 입력 받음
		System.out.println("사람 수 : " + player);
		
		int[] height = new int[player];	// 요솟수가 player인 배열을 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(90);	// 요소의 값을 난수로 결정
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
