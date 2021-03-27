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
		int 횡 =  0; // 0
		int 열 =  0; // 1


		
		while (num < 26) {
			if (der == 1) {
				for (int i = 0; i < 5; i++) {
					if (map[횡][i] == 0) {
						map[횡][i] = num;
						num++;
						횡++;
					}
					else if (map[횡][i] != 0) {
						der = 2;
						열++;
						continue;
					}
				}
				횡--;
			}
			else if (der == 2) {
				for (int i = 열; i < 5; i++) {
					if (map[i][횡] == 0) {
						map[i][횡] = num;
						num++;
						열++;
					}
					else if (map[i][횡] != 0) {
						der = 3;
						횡--;
						continue;
					}
				}
				열--;
			}
			else if (der == 3) {
				for (int i = 횡; i >= 0; i--) {
					if (map[열][i] == 0) {
						map[열][i] = num;
						num++;
						횡--;
					}
					else if (map[열][i] != 0) {
						der = 4;
						횡++;
						continue;
					}
				}
				열--;
			}
			else if (der == 4) {
				for (int i = 열; i >= 0; i--) {
					if (map[횡][i] == 0) {
						map[횡][i] = num;
						num++;
						열--;
					}
					else if (map[횡][i] != 0) {
						der = 1;
						횡++;
						continue;
					}
				}
				열++;
			}
		}
		for (int i = 0; i < map.length; i++) {
		System.out.println(Arrays.toString(map[i]));
	}
		
	}

}
