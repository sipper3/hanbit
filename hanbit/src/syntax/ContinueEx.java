package syntax;

/**
 * 2016. 4. 16.
 * ContinueEx.java
 * shipper3@naver.com
 * Story : 명령문 (break, continue, return) 연습
 */
public class ContinueEx {
	/**
	 * [문제]
	 * 1부터 10까지의 정수중에서 3의 배수를 제외한 수를 출려하시오.
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			
			if(i%3 == 0) continue;//조건이 맞으면 아래로 진행하지 말고 다시 처음에서 시작한다.
			System.out.print(i+"\t");
			
			//if(i%3 != 0) System.out.print(i+"\t");
		}
	}
}
