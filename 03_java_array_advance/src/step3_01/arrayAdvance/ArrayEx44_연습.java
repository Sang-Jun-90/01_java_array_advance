package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)

public class ArrayEx44_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];	
		int[] temp = new int[maxNum*maxNum];
		int size = 50;	
		int win = 0;
		
		// 
		int n = 0;
		
		for (int j = 0; j < temp.length; j++) {
			int ranNum = ran.nextInt(50)+1;
			int check = -1;
			for (int k = 0; k < temp.length; k++) {
				if (ranNum == temp[k]) check = 0;
			}
			if (check == -1) {
				temp[n] = ranNum;
				check = -1;
				n++;
			}
			else {
				j--;
			}
			
		}
		
		int num = 0;
		for (int j = 0; j < maxNum; j++) {
			for (int j2 = 0; j2 < maxNum; j2++) {
				bingo[j][j2] = temp[num];
				num++;
			}
		}


		while (true) {
			
			System.out.println("=============== BINGO GAME ===============");
			System.out.print("\t");
			for (int i=0; i<maxNum; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
			for (int i=0; i<maxNum; i++) {
				System.out.print(i + "\t");
				for (int j=0; j<maxNum; j++) {
					if (mark[i][j] == 0) {
						System.out.print(bingo[i][j] + "\t");
					}
					else {
						System.out.print("O\t");
					}
				}
				System.out.println("\n");
			}
			System.out.print("Y : ");
			int inputY = scan.nextInt();
			System.out.print("X : ");
			int inputX = scan.nextInt();
			
			if (inputY > 4 || inputY < 0 || inputX > 4 || inputX < 0 ) continue;
			
			mark[inputY][inputX] = 1;
			
			int horSum = 0;
			for (int i = 0; i < 5; i++) {
				horSum += mark[inputY][i];
			}
			System.out.println(horSum);
			if (horSum == 5) {
				System.out.println("win");
				break;
			}
			
			int verSum = 0;
			for (int i = 0; i < 5; i++) {
				verSum += mark[i][inputX];
			}
			System.out.println(verSum);
			if (verSum == 5) {
				System.out.println("win");
				break;
			}
			
			int x = 0;
			
			for (int i = 0; i < 5; i++) {
				x+= mark[i][i];
			}
			
			if (x == 5) {
				System.out.println("win");
				break;
			}
			
			int xx = 0;
			
			for (int i = 0; i < 5; i++) {
				x+= mark[i][4-i];
			}
			
			if (xx == 5) {
				System.out.println("win");
				break;
			}
		}
		

		scan.close();
	}

}
