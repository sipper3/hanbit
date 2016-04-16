package syntax;

/**
 * 2016. 4. 16.
 * SumIf10.java
 * shipper3@naver.com
 * Story : for - loop + if - branch 수열의 합
 */
public class SumIf10 {
	public static void main(String[] args) {
		// 문제 : for와 syso를 한번만 써서 홀수합, 짝수합을 구해라.
		int oddSum = 0, evenSum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) evenSum += i;
			else oddSum += i;
			
		}
		System.out.println("홀수의합은 "+oddSum+" 이고, 짝수의합은 "+evenSum+"이다.");
	}
}
