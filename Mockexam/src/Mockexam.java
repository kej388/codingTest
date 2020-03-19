
public class Mockexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();

		int[] answers = { 1, 2, 3, 4, 5};
		int result[] = solution.solution(answers);

		System.out.println("가장 문제를 많이 맞힌 사람은 수포자는 " + result[0] + "입니다.");
	}

}
