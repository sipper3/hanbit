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
		GradeBean grade = new GradeBean();
		GradeService service = new GradeServiceImpl();
		//E : 변수선언 영역 ------------------------------
		
		
		while (true) {
			System.out.println("[메뉴] 1.서비스계속, 2.서비스종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				//S : 파라미터 영역 ------------------------------
				System.out.println("이름 : [], 국어 : [], 영어 : [], 수학: [], 자바: []");
				//E : 파라미터 영역 ------------------------------
				
				//S : 메소드호출 영역 ------------------------------
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				grade.setJava(scanner.nextInt());
				//E : 메소드호출 영역 ------------------------------
				
				//S : 결과출력 영역 ------------------------------
				//System.out.println(name+"님의 총점은 "+total+"점이고, 평균은 "+avg+"점이고, 학점은 "+gradeTxt+" 입니다.");
				System.out.println(grade.getName()+" : "+service.getGrade(grade)+" 학점");
				//E : 결과출력 영역 ------------------------------
				break;
			case 2:
				System.out.println("서비스가 종료되었습니다.");
				return;
			default:
				System.out.println("1 또는 2만 입력가능합니다.");
				break;
			}
			
		}
		
		
				
	}

}
