package stage9;

import java.util.Scanner;

public class SeatReservation {
	
	Scanner sc = new Scanner(System.in);
	Seat[] s = new Seat[10];
	Seat[] a = new Seat[10];
	Seat[] b = new Seat[10];
	
	public SeatReservation(int num) {
		for(int i = 0; i < num; i++) { 
			s[i] = new Seat();
			a[i] = new Seat();
			b[i] = new Seat();
		}
	}
	
	public void nowSeatView(int num) {
		
		// 현재 좌석 상태 보여주기
		if(num == 1) {
			System.out.print("S>> ");
			for(int i = 0; i < s.length; i++) {
				System.out.print(s[i].getName() + " ");
			}
			System.out.println();
		} else if(num == 2) {
			System.out.print("A>> ");
			for(int i = 0; i < a.length; i++) {
				
				System.out.print(a[i].getName() + " ");
			}
			System.out.println();
			
		} else if(num == 3) {
			System.out.print("B>> ");
			for(int i = 0; i < b.length; i++) {
				System.out.print(b[i].getName() + " ");
			}
			System.out.println();
		}
	}
	
	// 좌석구분 예약
	public void reservate() {
	
		System.out.print("좌석구분  S(1), A(2), B(3) >> ");
		int num = sc.nextInt();
		
		// 현재좌석상태보여주기
		nowSeatView(num);
		
		
		// 이름입력
		System.out.print("이름 >> ");
		String name = sc.next();
		
		// 좌석번호 입력
		System.out.print("번호>> ");
		int seatNum = sc.nextInt();
		
		if(num == 1) {
			s[seatNum - 1].setName(name);
		} else if(num == 2) {
			a[seatNum - 1].setName(name);
		} else if(num == 3) {
			b[seatNum - 1].setName(name);
		}
		
	}
	
	public void view() {
		// S좌석
		System.out.print("S>> ");
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i].getName() + " ");
		}
		System.out.println();
		
		// A좌석
		System.out.print("A>> ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i].getName() + " ");
		}
		System.out.println();
		
		// B좌석
		System.out.print("B>> ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i].getName() + " ");
		}
		System.out.println();
		System.out.println("<<조회를 완료하였습니다.>>");
	}
	
	public void cancle() {
		System.out.print("좌석구분  S(1), A(2), B(3) >> ");
		int num = sc.nextInt();
		
		// 현재좌석상태보여주기
		nowSeatView(num);
		
		// 이름입력
		System.out.print("이름 >> ");
		String name = sc.next();
		
		if(num == 1) {
			for(int i = 0; i < s.length; i++) {
				s[i].checkCancle(name);
			}
		} else if(num == 2) {
			for(int i = 0; i < a.length; i++) {
				a[i].checkCancle(name);
			}
		} else if(num == 3) {
			for(int i = 0; i < b.length; i++) {
				b[i].checkCancle(name);
			}
		}
	}
	
	public void finish() {
		System.out.println("예약시스템 종료");
	}
	
	public void run() {
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int num = sc.nextInt();
			
			if(num == 1) reservate();
			else if(num == 2) view();
			else if(num == 3) cancle();
			else if(num == 4) { 
				finish();
				break;
			} else {
				System.out.println("없는 번호입니다. 다시 시작해주세요");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		SeatReservation sr = new SeatReservation(10);
		
		System.out.println("명품콘서트폴 예약  시스템입니다.");
		
		sr.run();
	}
}
