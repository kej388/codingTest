package stage7;

import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		} else {
			System.out.println(work + "입니다.");
		}
	}
}

public class MonthSchedule {
	Day[] w;
	int dayNum;
	String workname;
	
	public MonthSchedule() {};
	
	public MonthSchedule(int day) {
		 this.w = new Day[day];
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		// 날짜 입력
		System.out.println("날짜(1 ~ 30)? ");
		dayNum = sc.nextInt();
		dayNum--;
		
		w[dayNum] = new Day();
		// 할일 입력
		System.out.println("할일(빈칸없이입력)? ");
		String workInput = sc.next();
		
		w[dayNum].set(workInput);
		workname = w[dayNum].get();
	}
	
	public void view() {
		Scanner sc = new Scanner(System.in);
		// 날짜 입력
		System.out.println("날짜(1 ~ 30)? ");
		int viewnum = sc.nextInt();
		viewnum--;
		
		w[viewnum] = new Day();
		if(dayNum == viewnum) {
			System.out.println((dayNum + 1) + "일의 할 일은 " + workname + "입니다.");
			
		} else {
			System.out.print((viewnum + 1) + "일의 할 일은 ");
			w[viewnum].show();
		}
		
		// 출력
		//String workname = w[dayNum].get();
		
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		// 할일 순서 리스트
		while(true) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int workNum = sc.nextInt();
			
			// 입력1을 했을 때 
			if(workNum == 1) {
				this.input();
			} else if(workNum == 2) { // 보기2를 했을 때
				this.view();
			} else if(workNum == 3) {
				this.finish();
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		MonthSchedule april = new MonthSchedule(30);
		
		april.run();
	}
}
