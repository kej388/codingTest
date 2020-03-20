class Solution {
	public String solution(
			int a,
			int b) {
		
		String answer = "";

		// 1. 윤년인지 확인

		// 2. 요일의 이름 {SUN, MON, TUE, WED, THU, FRI, SAT} 생성
		String[] WeekArray = {
				"SUN",
				"MON",
				"TUE",
				"WED",
				"THU",
				"FRI",
				"SAT" };

		// 3. 2016년 1월 1일 금요일
		//2015*365 // 기본
		//2012/4-2012/100+2012/400 //윤년
		int fullYear = (2015 * 365) + (2012/4-2012/100+2012/400);
		int firstDay = fullYear / 2016;
		int[] allDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if()
		
		

		// 4. 2016년 a월 1일은 무슨 요일인지 확인

		// 5. 2016년 a월 b일 return

		return answer;
	}
}

public class practice {

	public static void main(
			String[] args) {
		int a = 5;
		int b = 24;

		Solution s = new Solution();

		String result = s
				.solution(
						a,
						b);

		System.out
				.println(
						result);
	}

}
