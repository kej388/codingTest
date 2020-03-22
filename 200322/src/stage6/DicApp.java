package stage6;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		
		int indexNumber = 0;
		String result = null;
		
		for(int i = 0; i < kor.length; i++) {
			if(word.equals(kor[i])) {
				indexNumber = i;
				result = eng[indexNumber];
			}
		}
		
		return result; 
	}
}

public class DicApp {
	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		Dictionary d = new Dictionary();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("한글 단어? ");
			String word = sc.next();
			
			if(word.equals("그만")) {
				break;
			}
			
			if(d.kor2Eng(word) == null) {
				System.out.println(word + "은 저의 사전에 없습니다.");
			} else System.out.println(word + "은 " + d.kor2Eng(word));
			
		}
		
		sc.close();
	}	
}
