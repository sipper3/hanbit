package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Operator.java
 * shipper3@naver.com
 * Story : 연산자 덧셈문법
 */
public class Plus {
	public static void main(String[] args) {
		System.out.println("두 수의 더하기 프로그램");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int a = scanner.nextInt();
		System.out.println("두번째 정수 입력");
		int b = scanner.nextInt();
		int c = a + b;
		System.out.println(a+" + "+b+" = "+c);
	}
}
