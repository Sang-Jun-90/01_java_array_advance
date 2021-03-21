package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx38_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		int[] sum = new int[3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i] += pay[i][j];
			}
		}
		System.out.println(Arrays.toString(sum));
		System.out.println();
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		
		System.out.print("입력 : ");
		int input = scan.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == input) System.out.println(pay[i][j]);
			}
		}
		
		System.out.println();
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		int maxHo = 0;
		int minHo = 0;
		int checkMoney1 = pay[0][0];
		int checkMoney2 = pay[0][0];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (checkMoney1 < pay[i][j]) {
					checkMoney1 = pay[i][j];
					maxHo = apt[i][j];
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (checkMoney2 > pay[i][j]) {
					checkMoney2 = pay[i][j];
					minHo = apt[i][j];
				}
			}
		}
		
		System.out.println(maxHo);
		System.out.println(minHo);
		System.out.println();
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		System.out.print("입력 : ");
		int input1 = scan.nextInt();
		System.out.print("입력 : ");
		int input2 = scan.nextInt();
		
		int tex1 = 0;
		int indexi = 0;
		int indexj = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (input1 > apt[i][j]) {
					indexi = i;
					indexj = j;
					tex1 = pay[i][j];
					
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (input2 > apt[i][j]) {
					
					pay[indexi][indexj] = pay[i][j];
					pay[i][j] = tex1;
					
				}
			}
		}
		

	}

}
