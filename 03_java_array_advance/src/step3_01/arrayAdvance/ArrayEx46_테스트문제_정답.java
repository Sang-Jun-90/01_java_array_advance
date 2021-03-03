package step3_01.arrayAdvance;

import java.util.*;

/*
 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 5
 * 
 *  - 1부터 5까지 숫자를 2개씩 넣고 셔플로 이용해서 섞지 말것
 * 
 */

public class ArrayEx46_테스트문제_정답 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		Boolean[] check1 = new Boolean[5];
		Boolean[] check2 = new Boolean[5];
		
		for (int i = 0 ; i < 5 ; i++) {
			check1[i] = false;
			check2[i] = false;
		}
		
	}

}
