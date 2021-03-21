package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Iterator;

/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx37_정답 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		
		int[] horSum = new int[3];
		
		for (int i = 0; i < garo.length; i++) {
			for (int j = 0; j < sero.length; j++) {
				horSum[i] += arr[i][j];
			}
		}
		System.out.print(Arrays.toString(horSum));
		
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612

		int[] verSum = new int[4];
		for (int i = 0; i < garo.length; i++) {
			for (int j = 0; j < sero.length; j++) {
				//i = 0 // j = 0,1,2,3
				verSum[j]+= arr[i][j];
			}
		}
		System.out.print(Arrays.toString(verSum));

	}

}
