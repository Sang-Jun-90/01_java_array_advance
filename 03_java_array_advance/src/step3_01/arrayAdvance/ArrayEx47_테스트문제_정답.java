package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
문제1) 숫자 0이 플레이어이다. 
	    
	    1) left 2)right 3)up 4)down 5)되감기
		번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다. 
		 예) 1 ==> 
		
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,0,15}		
		 
		
문제2) 심화  ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가 
 	5번입력시 ==> 왔던길로 되돌아가기 한다.
 	
*/

public class ArrayEx47_테스트문제_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int game[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,0}
				};
		
		int yx [][] = new int[10000][2];
		
		int y = 3;
		int x = 3;
		
		int count = 0;
		
		while (true) {
			
			for (int i = 0; i < 4; i++) {
				System.out.println(Arrays.toString(game[i]));
			}
			
			System.out.print("??");
			int sel = scan.nextInt();
			
			int yy = y;
			int xx = x;
			
			if (sel == 1) {
				if (xx-1 < 0) continue;
				int temp = game[yy][xx-1];
				game[yy][xx-1] = 0;
				game[yy][xx] = temp;
				yx[count][0] = y;
				yx[count][1] = x;
				count++;
				x--;
			}
			else if (sel == 2) {
				if (xx+1 > 3) continue;
				int temp = game[yy][xx+1];
				game[yy][xx+1] = 0;
				game[yy][xx] = temp;
				yx[count][0] = y;
				yx[count][1] = x;
				count++;
				x++;
			}
			else if (sel == 3) {
				if (yy-1 < 0) continue;
				int temp = game[yy-1][xx];
				game[yy-1][xx] = 0;
				game[yy][xx] = temp;
				yx[count][0] = y;
				yx[count][1] = x;
				count++;
				y--;
			}
			else if (sel == 4) {
				if (yy+1 > 3) continue;
				int temp = game[yy+1][xx];
				game[yy+1][xx] = 0;
				game[yy][xx] = temp;
				yx[count][0] = y;
				yx[count][1] = x;
				count++;
				y++;
			}
			else if (sel == 5) {
				
			}
			
		}

	}

}
