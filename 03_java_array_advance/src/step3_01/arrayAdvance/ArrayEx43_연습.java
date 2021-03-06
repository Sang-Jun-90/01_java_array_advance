package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx43_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		// 벽설치
		System.out.print("설치할 벽의 개수는 : ");
		wallCount = scan.nextInt();
		

		while(wallCount != 0) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			if (map[rY][rX] == 0) {
				map[rY][rX] = WALL;
				wallCount--;
			}
		}
		
		//공설치
		while(true) {
			int rY = ran.nextInt(SIZE-2)+1;
			int rX = ran.nextInt(SIZE-2)+1;
			if (map[rY][rX] == 0) {
				map[rY][rX] = BALL;
				ballY = rY;
				ballX = rX;

				break;
			}
		}
		
		// 골대 설치
		while(true) {
			int rY = ran.nextInt(SIZE-2)+1;
			int rX = ran.nextInt(SIZE-2)+1;
			if (map[rY][rX] == 0) {
				map[rY][rX] = GOAL;
				goalY = rY;
				goalX = rX;
				break;
			}
		}
		for (int i = 0; i < SIZE; i++) {System.out.println(Arrays.toString(map[i]));}
		
		// 플레이어 위치
		while(true) {
			System.out.println("플레이어의 위치 설정");
			System.out.print("Y값 : ");
			pY = scan.nextInt();
			System.out.print("X값 : ");
			pX = scan.nextInt();
			
			if (map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		
		// 게임시작
		while(true) {
			// 화면구성
			System.out.println("==================");
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == PLAYER) System.out.print("* ");
					else if (map[i][j] == BALL) System.out.print("＠ ");
					else if (map[i][j] == WALL) System.out.print("| ");
					else if (map[i][j] == GOAL) System.out.print("＃ ");
					else System.out.print("0 ");
					
				}
				System.out.println("");
			}
			if (ballY == goalY && ballX == goalX) {System.out.println("게임종료");break;}
			System.out.println("==================");
			System.out.println("상(1), 하(2), 좌(3), 우(4) : ");
			int input = scan.nextInt();
			
			int yy = pY;
			int xx = pX;
			
			if (input == 1) yy--;
			else if (input ==2) yy++;
			else if (input ==3) xx--;
			else if (input ==4) xx++;
			
			if (yy < 0 || yy > SIZE || xx > SIZE || xx < 0) continue;
			if (map[yy][xx]== WALL || map[yy][xx]== GOAL) continue;
			
			
			
			if (map[yy][xx]== BALL) {
				int yyy = yy;
				int xxx = xx;
				
				if (input == 1) yyy--;
				else if (input ==2) yyy++;
				else if (input ==3) xxx--;
				else if (input ==4) xxx++;
				
				if (yyy < 0 || yyy > SIZE || xxx > SIZE || xxx < 0) continue;
				if (map[yyy][xxx]== WALL ) continue;
				
				ballY = yyy;
				ballX = xxx;
				
				map[ballY][ballX] = BALL;
				
			}
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = PLAYER;
			
			
			
			
			
		}
		
		
		
		
//		scan.close();
		
	}

}
