
public class Solution {
	
    public int[] solution(int[] answers) {
    	
        // 수포자들의 찍는 방식 
        int supoza[][] = {
        		{1, 2, 3, 4, 5},
        		{2, 1, 2, 3, 2, 4, 2, 5},
        		{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        // 각 수포자들의 정답 갯수
        int count[] = {0, 0, 0};
        
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < answers.length; j++) {
        		if(answers[j] == supoza[i][j]) {
        			count[i]++;
        		}
        	}
        }
        
        // 많이 맞춘 수포자 리턴하기
        int[] answer = {};
        int max = count[0];
        for(int i = 1; i <= 2; i++) {
        	if(max > count[i]) {
            	answer[0] = 1;
            } else {
            	max = count[i];
            }
        }
        
        if(count[0] == count[1] && count[1] == count[2]) {
        	answer[0] = 1;
        	answer[1] = 2;
        	answer[2] = 3;
        }else if(count[0] > count[1] && count[0] > count[2]) {
        	answer[0] = 1;
        }else if(count[1] > count[2] && count[1] > count[0]) {
        	answer[0] = 2;
        }else if(count[2] > count[0] && count[2] > count[1]) {
        	answer[0] = 3;
        }
        
        return answer;
    }

}
