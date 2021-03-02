package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[4단계] : 전체 기능구현
 * 
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */


public class ArrayEx30_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int usrCnt = 0;
		int identifier = -1;
		Boolean loginCheck = false; 
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			System.out.println("");
			if (identifier == -1) {
			}
			else {
				System.out.println(arId[identifier] + " 님 반갑습니다.");
			}
			
			System.out.println(menu);
			
			System.out.println("");
			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();
			// 가입
			if(sel == 1) {
				System.out.print("아이디 : ");
				int id = scan.nextInt();
				
				for (int i = 0; i < arId.length; i++) {
					if (id == arId[i]) {
						System.out.println("아이디 중복");
						continue;
					}
				}
				
				System.out.print("비밀번호 : ");
				int pw = scan.nextInt();
				
				arId[usrCnt] = id;
				arPw[usrCnt] = pw;
				arMoney[usrCnt] = 1000;
				
			}
			// 탈퇴
			else if(sel == 2) {
				System.out.print("비밀번호 : ");
				int pw = scan.nextInt();
				
				if (arPw[identifier] == pw ) {
					arId[identifier] = 0;
					arPw[identifier] = 0;
					loginCheck = false;
					identifier = -1;
				}
				
			}
			// 로그인
			else if(sel == 3) {
				System.out.print("아이디 : ");
				int id = scan.nextInt();
				
				for (int i = 0; i < arId.length; i++) {
					if (id == arId[i]) identifier = i;
				}
				
				if (identifier == -1) {
					System.out.println("아이디가 존재하지 않습니다.");
					continue;
				}
				
				System.out.print("비밀번호 : ");
				int pw = scan.nextInt();
				
				if (pw == arPw[identifier]) {
					System.out.println("로그인되었습니다.");
				}
				else {
					System.out.println("비밀번호가 틀렸습니다.");
					identifier = -1;
					continue;
				}
				
			}
			else if(sel == 4) {}
			else if(sel == 5) {}
			else if(sel == 6) {}
			else if(sel == 7) {}
			else if(sel == 0) {
				break;
			}
		}



	}

}
