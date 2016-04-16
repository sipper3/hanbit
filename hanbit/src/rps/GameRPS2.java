package rps;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * RPS.java
 * shipper3@naver.com
 * Story : 가위바위보 게임
 */
public class GameRPS2 {
	/**
	 * 컴퓨터와 사용자간의 가위바위보 게임을 완성하시오.
	 * Math.random()*E+S
	 * S 는 시작값
	 * E 는 마지막값
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("=== 가위바위보 게임 ===");
		System.out.println("가위:1, 바위:2, 보:3");
		Scanner scn = new Scanner(System.in);
		//------------------------[가공해야할 데이터를 입력하는 부분]------------------------------------
		int sccisors=1, rock=2, pager=3, rpsValue=0, comValue=0;
		rpsValue = scn.nextInt();
		comValue = (int) (Math.random()*3+1);
		String resultMsg = "";
				
		switch (rpsValue) {
		case 1:
			
			if(comValue == 1) resultMsg = "사용자는 가위, 컴퓨터는 가위, 결과는 무승부";
			else if(comValue == 2) resultMsg = "사용자는 가위, 컴퓨터는 바위, 결과는 패배";
			else resultMsg = "사용자는 가위, 컴퓨터는 보, 결과는 승리";
			
			break;
		case 2:
			
			if(comValue == 1) resultMsg = "사용자는 바위, 컴퓨터는 가위, 결과는 승리";
			else if(comValue == 2) resultMsg = "사용자는 바위, 컴퓨터는 바위, 결과는 무승부";
			else resultMsg = "사용자는 바위, 컴퓨터는 보, 결과는 패배";
			
			break;
		case 3:
			
			if(comValue == 1) resultMsg = "사용자는 보, 컴퓨터는 가위, 결과는 패배";
			else if(comValue == 2) resultMsg = "사용자는 보, 컴퓨터는 바위, 결과는 승리";
			else resultMsg = "사용자는 보, 컴퓨터는 보, 결과는 무승부";
			
			break;
		default:
			resultMsg = "1~3까지 정수만 입력바랍니다.";
			break;
		}
		//------------------------[결과가 보여지는 부분]------------------------------------
		
		System.out.println(resultMsg);

	}

}
