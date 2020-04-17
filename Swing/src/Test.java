import java.util.ArrayList;

public class Test {
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
	    int[][] answer = new int[arr1.length][arr1[0].length];
	    
	    for(int i = 0; i < answer.length; i++) {
	    	for(int j = 0; j < answer[0].length; j++) {
	    		answer[i][j] = arr1[i][j] + arr2[i][j];
	    	}
	    }
	    return answer;
	  }
	

	  public String solution(String phone_number) {
	    
	      char[] ch = phone_number.toCharArray();
	      for(int i = 0; i < ch.length - 4; i++) {
	    	  ch[i] = '*';
	      }
	      
	      return String.valueOf(ch);
	  }
	
	public static void main(String[] args) {
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		
		Test test = new Test();
		
		String phone_number = "01033334444";
		
		System.out.println(test.solution(phone_number));
		
		int result = test.solution(arr1, arr2)[0][0];
		System.out.println(result);
	}
}
