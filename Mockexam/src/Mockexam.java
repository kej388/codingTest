
public class Mockexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] answers = { 1, 2, 3, 4, 5};
		int result[];
		result = solution(answers);

		System.out.println("가장 문제를 많이 맞힌 사람은 수포자는 " + result + "입니다.");
	}
	
	public static int[] solution(int[] answers) {
    	
        // 수포자들의 찍는 방식 
        int supoza[][] = {
        		{1, 2, 3, 4, 5},
        		{2, 1, 2, 3, 2, 4, 2, 5},
        		{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        // 각 수포자들의 정답 갯수
        int[] count = {0, 0, 0};
        int[] answer = new int[3];
        
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < answers.length; j++) {
        		if(answers[j] == supoza[i][j]) {
        			count[i]++;
        		}
        	}
        }
        
        // 가장 높은 점수를 받은 사람이 여럿일 경우
        
        // 가장 높은 점수를 받은 사람 리턴
        int max = 0;
		for(int i = 0; i < 3; i++) {
			if(max > count[i]) {
				max = count[i];
			} else if(max == count[i]) {
				answer[i] = highScore(count, count[i]);
			} 
		} 
		
		answer[0] = highScore(count, max);
        
		
        
        
        return answer;
    }
	
	public static int highScore(int[] count, int key) {
		
		int num;
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] == key) {
				num = i;
				return num;
			}
		}
		
		return 0;
	}
	
}
