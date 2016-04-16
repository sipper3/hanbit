package rps;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * RPS.java
 * shipper3@naver.com
 * Story : 가위바위보 게임
 */
public class GameRPS1 {
	/**
	 * 컴퓨터와 사용자간의 가위바위보 게임을 완성하시오.
	 * Math.random()*E+S
	 * S 는 시작값
	 * E 는 마지막값
	 * @param args
	 */
	public static void main(String[] args) {
		int sccisors=1, rock=2, pager=3, rpsValue=0, comValue=0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("=== 가위바위보 게임 ===");
		System.out.println("가위:1, 바위:2, 보:3");
		rpsValue = scn.nextInt();
		comValue = (int) (Math.random()*3+1);
		
		switch (rpsValue) {
		case 1:
			
			if(comValue == 1) System.out.println("무승부");
			else if(comValue == 2) System.out.println("패");
			else System.out.println("승");
			break;
		case 2:
			
			if(comValue == 1) System.out.println("승");
			else if(comValue == 2) System.out.println("무승부");
			else System.out.println("패");		
			break;
		case 3:
			
			if(comValue == 1) System.out.println("패");
			else if(comValue == 2) System.out.println("승");
			else System.out.println("무승부");
			break;

		default:
			System.out.println("1~3까지 정수만 입력바랍니다.");
			break;
		}

	}

}
