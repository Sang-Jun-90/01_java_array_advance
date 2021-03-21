package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx36_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
//		System.out.print("입력 1");
//		int index1 = scan.nextInt();
//		System.out.print("입력 2");
//		int index2 = scan.nextInt();
//		
//		
//		System.out.print(arr[index1][index2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
//		int find1 = -1;
//		int find2 = -1;
//		
//		System.out.print("입력 : ");
//		int input = scan.nextInt();
//		
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				if (arr[i][j]==input) {
//					find1 = i;
//					find2 = j;
//				}
//			}
//		}
//		
//		System.out.print("인덱스 1 : " + find1 + "인덱스 2 : " + find2);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		int maxNum = arr[0][0];
		int maxIndex1 = 0;
		int maxIndex2 = 0;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] > maxNum) {
					maxIndex1 = i;
					maxIndex2 = j;
				}
			}
		}
		
		System.out.print("인덱스 1 : " + maxIndex1 + "인덱스 2 : " + maxIndex2);
		
		// 문제 4) 값 2개를 입력받아 값 교체

		System.out.print("입력 1");
		int value1 = scan.nextInt();
		System.out.print("입력 2");
		int value2 = scan.nextInt();
		
		int tempi = 0 ; 
		int tempj = 0 ; 
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] == value1) {
					tempi = i;
					tempj = j;
				}
			}
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (arr[i][j] == value2) {
					arr[tempi][tempj] = value2;
					arr[i][j] = value1;
				}
			}
		}
		
		for (int i =0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {			
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
