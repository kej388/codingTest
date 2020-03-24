package stage7;

import java.util.Scanner;

public class PhoneBook {
	
	Phone phone[];
	
	public PhoneBook(int num) {
		this.phone = new Phone[num];
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < phone.length; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			String name = sc.next();
			String tel = sc.next();
			
			phone[i] = new Phone();
			phone[i].set(name, tel);
		}
		
		System.out.println("저장되었습니다...");

	}
	
	public void search(String wordinput) {
		
		for(int i = 0; i < phone.length; i++) {
			if(phone[i].name.equals(wordinput)) {
				System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel());
				break;
			} 
			
			if(i == phone.length - 1) {
				System.out.println("없습니다.");
			}
		}
		
		
		
	}
	
	public void finish() {
		System.out.println("프로그램 종료");
	}
	
	public void run() {
		input();
		Scanner sc = new Scanner(System.in);
		String wordinput;
		while(true) {
			System.out.print("검색할 이름>> ");
			wordinput = sc.next();
			if(wordinput.equals("그만")) {
				finish();
				break;
			} 
			search(wordinput);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("인원수>> ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		PhoneBook pb = new PhoneBook(num);
		
		pb.run();
		sc.close();
	}
}
