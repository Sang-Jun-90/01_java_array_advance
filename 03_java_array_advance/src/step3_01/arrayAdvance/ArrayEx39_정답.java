package step3_01.arrayAdvance;

import java.util.Arrays;

/*
 
 	# 중복 안된 숫자 제거
 	
	int[] test1 = {1,2,3,2,1};		
	int[] test2 = {1,3,4,4,2};
	int[] test3 = {1,1,1,2,1};
	
	// 위 배열에서 중복안된숫자를 제거하시요 
	// 1) {1,2,1,2}
	// 2) {4,4}
	// 3) {1,1,1,1}
	 
 */

public class ArrayEx39_정답 {

	public static void main(String[] args) {
		
		int[] test1  = {1,2,3,2,1};
		int[] test2  = {1,3,4,4,2};
		int[] test3  = {1,1,1,2,1};
		int[] result1 = new int[5];
		int[] result2 = new int[5];
		int[] result3 = new int[5];
		

		for (int i = 0; i < 5; i++) {
			int check1 = 0;
			int check2 = 0;
			int check3 = 0;
			for (int j = 0; j < 5; j++) {
				if (test1[j] == test1[i]) check1++;
				if (test2[j] == test2[i]) check2++;
				if (test3[j] == test3[i]) check3++;
			}
			if (check1 == 1) test1[i] = 0;
			else if(check1 != 1) result1[i] = test1[i];
			if (check2 == 1) test2[i] = 0;
			else if(check2 != 1) result2[i] = test2[i];
			if (check3 == 1) test3[i] = 0;
			else if(check3 != 1) result3[i] = test3[i];
		}
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
		System.out.println(Arrays.toString(result3));
		
	}

}
