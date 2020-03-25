package stage6;

import java.util.Scanner;

class Player{
	String name;
	String word;
	int lastIndex;		// 마지막 문자에 대한 인덱스
	char lastChar;		// 마지막 문자
	char firstChar;		// 첫번재 문자
	
	public void name(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 사용자로부터 단어를 입력받아 마지막문자와 첫번째문자를 저장한다.
	public void getWordFromUser(String word) {
		this.word = word;
		lastIndex = word.length() - 1;
		lastChar = word.charAt(lastIndex);
		firstChar = word.charAt(0);
	}
	
	// 기존문자의 마지막문자와 사용자로부터 받은 문자의 첫번째문자가 일치하는지 판별
	public boolean checkSuccess(char originLastChar, char firstChar) {
		if(originLastChar == firstChar) {
			return true;
		}
		return false;
	}
}

public class WordGameApp {
	
	Player player[];
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
		int num = sc.nextInt();
		
		player = new Player[num];
		
		for(int i = 0; i < player.length; i++) {
			System.out.print("참가자의 이름을 입력하세요>> ");
			String playerName = sc.next();
			
			player[i] = new Player();
			player[i].name(playerName);
		}
		
		System.out.println("시작하는 단어는 아버지입니다.");
		
		String word = "아버지";
		int lastIndex = word.length() - 1;	//마지막 문자에 대한 인덱스
		char lastChar = word.charAt(lastIndex);	// 마지막 문자
		boolean check = true;
		
		for(int i = 0; ; i++) {
			
			if(i > 2) {
				i = 0;
			}
			
			System.out.println(player[i].getName() + " >> ");
			String newWord = sc.next();
			
			player[i].getWordFromUser(newWord);
			
			
			check = player[i].checkSuccess(lastChar, player[i].firstChar);
			
			lastChar = player[i].lastChar;
			
			if(check == false) {
				System.out.println(player[i].name + "이 졌습니다.");
				break;
			}
			
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다.");
		
		WordGameApp start = new WordGameApp();
		
		start.run();
		
	}
}
