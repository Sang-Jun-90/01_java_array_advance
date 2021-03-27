package step3_01.arrayAdvance;

import java.util.Random;

/*
  
	문제1) 1 ~ 백만 사이의 숫자를 입력받고 가운데 숫자 출력 
	(단 ! 짝수자리의 수는 짝수자리라고 출력)
	예)  123 ==> 2
	예)  1234 ==> 짝수의 자리이다
	예)  1 ==> 1
	예)  1234567 ==> 4
	
	힌트) 자리수를 구하고 배열을 만든다음 하나씩 저장 
	예) ==> 123 ==> 3 ==> arr[] = new int[3];
	
*/

public class ArrayEx48_테스트문제_정답 {

	public static void main(String[] args) {

		Random ran = new Random();
		int num  = ran.nextInt(1000000)+1;
		
		int check = 0;
		
		if (num < 10) check = 1;
		else if (num <  100)  check = 2;
		else if (num <  1000)  check = 3;
		else if (num <  10000)  check = 4;
		else if (num <  100000)  check = 5;
		else check = 6;
		
		String numS = Integer.toString(num);
		char[] numArr = new char[check];
		
		for (int i = 0; i < check; i++) {
			numArr[i] = numS.charAt(i);
		}
		System.out.println(numS);
		if (check % 2 == 0) System.out.println("짝");
		else System.out.println(numArr[check % 2 + 1 ]);
	}

}
