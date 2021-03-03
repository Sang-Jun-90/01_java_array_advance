package step3_01.arrayAdvance;

import java.util.Arrays;

/*
 * # 정렬하기
 * 
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


public class ArrayEx31_정답 {

	public static void main(String[] args) {
		
		int[] scores = {10, 50, 30, 40, 80, 7};
		
		int index = 0;
		
		while(index < 6 ) {
			int findIndex = 0;
			int high = 0;
			
		    for (int i = index ; i < scores.length ; i++) {
	    	    if (high < scores[i]) {
	    		    findIndex = i;
	    		    high = scores[i];
	    	    }
		    }
	    	System.out.println(high);
	    	System.out.println(findIndex);
	    	
	    	scores[findIndex] = scores[index];
	    	scores[index] = high;
	    			
			index++;
		}
		
		

	    
	    System.out.print(Arrays.toString(scores));

	}

}
