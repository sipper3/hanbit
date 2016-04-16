package grade;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * GradeMain.java
 * shipper3@naver.com
 * Story : 성적표 프로그램
 */
public class GradeMain {
	/**
	 * [문제]
	 * 과목별 점수를 입력받아 총점, 평균, 학점을 구하는 프로그램을 완성하시오.
	 * 과목은 - 국, 영, 수
	 */
	public static void main(String[] args) {
		
		//S : 변수선언 영역 ------------------------------
		Scanner scanner = new Scanner(System.in);
		Grade grade = new Grade();
		int[] scores = new int[3];
		int total = 0;
		double avg = 0;
		String gradeTxt = "", name = "";
		//E : 변수선언 영역 ------------------------------
		
		//S : 파라미터 영역 ------------------------------
		System.out.println("이름 : [], 국어 : [], 영어 : [], 수학: []");
		name = scanner.next();
		scores[0] = scanner.nextInt();
		scores[1] = scanner.nextInt();
		scores[2] = scanner.nextInt();
		//E : 파라미터 영역 ------------------------------
		
		//S : 메소드호출 영역 ------------------------------
		total = grade.getTotalArray(scores);
		avg = grade.getAvg(total, scores.length);
		gradeTxt = grade.getGrade(avg);
		//E : 메소드호출 영역 ------------------------------
		
		//S : 결과출력 영역 ------------------------------
		System.out.println(name+"님의 총점은 "+total+"점이고, 평균은 "+avg+"점이고, 학점은 "+gradeTxt+" 입니다.");
		//E : 결과출력 영역 ------------------------------
				
	}

}
