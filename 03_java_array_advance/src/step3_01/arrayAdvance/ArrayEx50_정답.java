package step3_01.arrayAdvance;

import java.util.Arrays;

/*
 * # 달팽이
 * 
 * 1	2	3	4	5	
 * 16	17	18	19	6	
 * 15	24	25	20	7	
 * 14	23	22	21	8	
 * 13	12	11	10	9
 * 
 * 
 * 1) 오른쪽 방향으로 순서대로 숫자저장
 * 2) 아래쪽 방향으로 순서대로 숫자저장
 * 3) 왼쪽 방향으로 순서대로 숫자저장
 * 4) 윗쪽 방향으로 순서대로 숫자저장
 * 
 * 1)2)3)4) 반복
 */


public class ArrayEx50_정답 {

	public static void main(String[] args) {

		int[][] map = new int[5][5]; 
		
		int num = 1;
		int der = 1; // 1 > 오른쪽 / 2 > 아래  / 3 > 왼쪽 / 4 > 위
		int line =  0; // 1
		int lineCount =  0; // 0
		int k = 5;  // 3


		
		while (num < 26) {
			if (der == 1) {
				for (int i = 0; i < k; i++) {
					map[line][lineCount] = num;
					num++;
					lineCount++;
				}
				lineCount--;
				line++;
				k--;
				der = 2;
			}
			else if (der == 2) {
				for (int i = 0; i < k; i++) {
					map[line][lineCount] = num;
					num++;
					line++;
				}
				line--;
				lineCount--;
				der = 3;
				
			}
			else if (der == 3) {
				
				for (int i = 0; i < k; i++) {
					map[line][lineCount] = num;
					num++;
					lineCount--;
				}
				lineCount++;
				line--;
				k--;
				der = 4;
			}
			else if (der == 4) {
				for (int i = 0; i < k; i++) {
					map[line][lineCount] = num;
					num++;
					line--;
				}
				line++;
				lineCount++;
				
				der = 1;
			}
		}
		
		for (int i = 0; i < map.length; i++) {
		System.out.println(Arrays.toString(map[i]));
	}
		
	}

}
