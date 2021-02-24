package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자 야구 게임
 * 
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		    strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 7 5 1        : 1b
 * 1 5 6		: 1s
 * 1 7 3        : 1s 2b
 * 2 4 9        : 없음
 * 1 7 3        : 3s  > 게임종료
 * 
 */

public class ArrayEx29_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1,7,3};
		int[] me  = new int[3];
		
		while (true) {
			int strike = 0;
			int ball = 0;
			
			System.out.print("입력 : ");
			int input = scan.nextInt();
			me[0] = input / 100;
			me[1] = (input / 10) % 10;
			me[2] = input % 10;
			
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < me.length; j++) {
					if (com[i] == me[j]) {
						if (i==j) strike++;
						else ball++;
					}
				}
			}
			
			if (strike == 3) {System.out.println("홈런");break;}
			System.out.print(Arrays.toString(me) + " - ");
			System.out.println("strike : " + strike + "   ball : " + ball);
			
		}
		
		
	}
	
}
