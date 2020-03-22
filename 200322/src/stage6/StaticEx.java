package stage6;

class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
	
		int lengthConcat = a.length + b.length;
		
		int[] result = new int[lengthConcat];
	
		int count = a.length;
		int j = 0;
		
		for(int i = 0; i < lengthConcat; i++) {
			
			if(count != 0) { 
				result[i] = a[i];
				count--;
			}
			else {
				result[i] = b[j];
				j++;
			}
		}
		
		return result;
	}
	public static void print(int[] a) {
		
		System.out.print("[ ");
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
		
	}
}

public class StaticEx {
	
	public static void main(String[] args) {
		int[] array1 = {1, 5, 7, 9};
		int[] array2 = {3, 6, -1, 100, 77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
