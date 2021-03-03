package step3_01.arrayAdvance;

/*
 * # 석차 출력
 * 
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_정답 {
	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		
		
	    int index = 0;
	    
	    while (index < scores.length) {
	    	String highName = "";
	    	int high = 0;
	        int highIndex = 0;
	    	
	    	for (int i = index ; i < names.length ; i++) {
	    		
	    		if (high < scores[i]) {
	    			highName = names[i];
	    			high = scores[i];
	    			highIndex = i;
	    		}
	    	}
	    	scores[highIndex] = scores[index];
	    	scores[index] = high;
	    	
	    	names[highIndex] = names[index];
	    	names[index] = highName;
	    	
	    	
	    	index++;
	    }
	    
	    for (int j = 0 ; j < names.length ; j++) {
	    	System.out.println(names[j]);
	    }
		
		
	}

}
