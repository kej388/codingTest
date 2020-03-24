package stage9;

import java.util.Scanner;

public class SeatReservation {
	
	Scanner sc = new Scanner(System.in);
	
	public void reservate() {
		System.out.println("좌석구분  S(1), A(2), B(3) >> ");
		int num = sc.nextInt();
		
		if(num == 1) {
			
		}
	}
	
	public void view() {
		
	}
	
	public void cancle() {
		
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
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		SeatReservation sr = new SeatReservation();
		
		System.out.println("명품콘서트폴 예약  시스템입니다.");
		
		sr.run();
	}
}
