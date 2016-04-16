package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * MaxMin.java
 * shipper3@naver.com
 * Story : 배열 + for문
 */
public class MaxMin {
	/**
	 * [문제]
	 * 한반에 5명의 학생이 시험을 치렀습니다.
	 * 선생님이 5명의 점수를 익력하자마자 바로 최고점과 최저점이 출력되는
	 * 프로그램을 완성하세요.
	 */
	public static void main(String[] args) {
		System.out.println("=== 접수를 입력하면 최고점, 최저점이 출력됩니다. ===");
		System.out.println("총 3명의 점수만 입력이 가능합니다. 입력해주세요.");
		
		Scanner scn = new Scanner(System.in);
		
		int max = 0, min = 0, score1 = 0, score2 = 0, score3 = 0;
		/*
		score1 = scn.nextInt();
		score2 = scn.nextInt();
		score3 = scn.nextInt();
		
		if((score1>score2) && (score1>score3)){
			max = score1;
		}else if(score2>score3){
			max = score2;			
		}else{
			max = score3;
		}
		System.out.println(max);
		*/
		int[] scores = new int[3];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scn.nextInt();
		}
		
		
		System.out.println(max);
		
			
		
		
		
		
		
		
		
		
	}
}
