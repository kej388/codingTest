package chap02;

class ReverseArray {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	public static void main(String[] args) {
		int[] a = {5, 10, 73, 2, -5, 42};	// 배열 reverse할 요소들
		
		for(int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[j]);
			}
			System.out.println("a[" + i + "]과 " + "a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, a[i], a[a.length - i -1]);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
		
		
	}
}
