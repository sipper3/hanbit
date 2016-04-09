package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Multi.java
 * shipper3@naver.com
 * Story : 곱셈 문법
 */
public class Multi {
	public static void main(String[] args) {
		int a=0, b=0, c=0;//지역변수 초기화
		System.out.println("=== 곱셉 문법 ===");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		a = scanner.nextInt();
		System.out.println("두번째 정수 입력");
		b = scanner.nextInt();
		c = a * b;
		System.out.println(a+" X "+b+" = "+c);
	}
}
