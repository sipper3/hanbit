package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * InputSum.java
 * shipper3@naver.com
 * Story : 1부터 입력된 수까지 누적값을 더하는 계산문제
 */
public class InputSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		/**
		 * [문제]
		 * for로 입력된 값들의 합을 구하는 연산실을 완성하시오.
		 */
		System.out.println("1부터 주적되는 합계를 구할 마지막 수를 입력하세요.");
 
		int limit = scn.nextInt(), sum = 0;
		
		for (int i = 1; i <= limit; i++) {
			sum += i;
		}
		
		
		System.out.println("1부터 "+limit+"까지의 합은 "+sum);
	}
}
