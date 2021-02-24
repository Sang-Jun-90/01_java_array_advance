package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

// 2021-02-23 20:21 ~ 
public class ArrayEx26_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
	
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		Boolean[] front1 = new Boolean[SIZE];
		for (int i = 0; i < front1.length; i++) front1[i] = false;
		
		int[] back  = new int[SIZE];
		Boolean[] back1 = new Boolean[SIZE];
		for (int i = 0; i < back1.length; i++) back1[i] = false;
		
		// 랜덤값 넣기
		
		int cnt1 = 0;
		while (cnt1 < 9) {
			int ranNum = ran.nextInt(SIZE); 
			if (front1[ranNum] == false) {
				front[cnt1] = ranNum+1;
				front1[ranNum] = true;
				cnt1++;
			}
		}

		int cnt2 = 0;
		while (cnt2 < 9) {
			int ranNum = ran.nextInt(SIZE); 
			if (back1[ranNum] == false) {
				back[cnt2] = ranNum+10;
				back1[ranNum] = true;
				cnt2++;
			}
		}
		
		// 게임 구동
		
		int count = 1;
		
		while (true) {
			
			for (int i = 0; i < back1.length; i++) {  
				if (front[i] == 0) System.out.print("      ");
				else System.out.print(front[i]+"    ");
				if (i % 3 == 2) System.out.println("");
			}
			
			System.out.println("");
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			if (input > 8 || input < 0) continue;
			
			if (front[input] == count) {
				if (count >= 9) front[input] = 0;
				else front[input] = back[input];
				count++;
			}
			if (count == 18) {System.out.println("성공");break;}
		
		}
		
	}
	
}
