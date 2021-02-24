package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx40_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		
		while(true) {
			
			for (int i=0; i<elementCnt; i++) {
				System.out.print(scores[i] + " ");
			}
			System.out.println();
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("추가할 값 : ");
				int insertData = scan.nextInt();
				
				if (elementCnt == 0) {
					scores = new int[elementCnt + 1];
				}
				else if (elementCnt > 0) {
					
					int[] temp = scores;
					scores = new int[elementCnt + 1];
					
					for (int i = 0; i < elementCnt; i++) {
						scores[i] = temp[i];
					}
					temp = null;
				}
				scores[elementCnt] = insertData;
				elementCnt++;
				
			}
			else if (sel == 2) {
				System.out.print("삭제할 인덱스 : ");
				int delIdx = scan.nextInt();
				
				if (delIdx < 0 || delIdx > elementCnt ) {
					System.out.print("해당 값은 존재하지 않습니다.");
					continue;
				}
				if (elementCnt == 1) {
					scores = null;
				}
				else if (elementCnt > 1) {
					int[] temp = scores;
					scores = new int[elementCnt-1];
					
					
					for (int i = 0; i < delIdx; i++) {
						scores[i] = temp[i];
					}
					for (int i = delIdx; i < elementCnt-1; i++) {
						scores[i] = temp[i+1];
					}
					temp = null;
				}
				elementCnt--;
				
			}
			else if (sel == 3) {
				System.out.print("삭제할 값 : ");
				int delData = scan.nextInt();
				
				int delIndex = -1;
				for (int i = 0; i < scores.length; i++) {if (delData == scores[i]) delIndex = i;}
				
				if (delIndex == -1 ) {
					System.out.print("해당 값은 존재하지 않습니다.");
					continue;
				}
				if (elementCnt == 1) {
					scores = null;
				}
				else if (elementCnt > 1) {
					int[] temp = scores;
					scores = new int[elementCnt-1];
					
					int j = 0;
					for (int i = 0; i < elementCnt; i++) {
						if (i != delIndex) {
							scores[j++] = temp[i];
						}
					}
					
					temp = null;
				}
				elementCnt--;
				
			}
			else if (sel == 4) {
				System.out.print("삽입할 인덱스 : ");
				int insertIdx = scan.nextInt();
				
				if (insertIdx < 0 || insertIdx > elementCnt) {
					System.out.print("해당 위치는 존재하지 않습니다.");
					continue;
				}
				
				System.out.print("삽입할 데이터 : ");
				int insertData = scan.nextInt();
				
				if (insertIdx == 0) {
					scores = new int[elementCnt+1];
				}
				else if (insertIdx > 0) {
					int[] temp = scores;
					scores = new int [elementCnt+1];
					
					int j = 0;
					
					for (int i = 0; i < elementCnt+1; i++) {
						if (i != insertIdx) {
							scores[i] = temp[j++];
						}
					}
					temp = null;
				}
				
				scores[insertIdx] = insertData;
				elementCnt++;
				
			}
			// 0번(종료)을 선택한 경우
			else if (sel == 0) {
				break;
			}
		}



	}

}
