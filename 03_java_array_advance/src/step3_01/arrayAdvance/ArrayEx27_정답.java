package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class ArrayEx27_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0};
		
		int player = 4;
		
		while (true) {
			
			System.out.println(Arrays.toString(game));
			
			System.out.print("입력 : ");
			int input1 = scan.nextInt();
			
			// 1 입력
			
			if (input1 == 1) {
				if (game[player-1] == 1) {
					System.out.println("※벽입니다.");
					System.out.print("벽 격파?(3번)");
					int input2 = scan.nextInt();
					if (input2 == 3) {
						game[player] = 0;
						game[player-1] = 2;
						player--;
					}
				}
				else {
					game[player] = 0;
					game[player-1] = 2;
					player--;	
				}
			}
			
			// 2 입력

			else if (input1 == 2) {
				if (game[player+1] == 1) {
					System.out.println("※벽입니다.");
					System.out.print("벽 격파?(3번)");
					int input2 = scan.nextInt();
					if (input2 == 3) {
						game[player] = 0;
						game[player+1] = 2;
						player++;
					}
				}
				else {
					game[player] = 0;
					game[player+1] = 2;
					player++;	
				}
			}
			
			// 그외
			
			else System.out.println("다시 입력하세요.");
			
		}
		
	}
	
}
