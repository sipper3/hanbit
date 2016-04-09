package syntax;

import java.util.Scanner;

/**
 * 2016. 4. 9.
 * Minus.java
 * shipper3@naver.com
 * Story : 연산자 뺄셈 문법
 */
public class Minus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===뺄셈 테스트===");
		System.out.println("첫번째 정수 입력");
		int a = scanner.nextInt();
		System.out.println("두번째 정수 입력");
		int b = scanner.nextInt();
		int c = a - b;
		System.out.println(a+"-"+b+" = "+c);
		
		
		System.out.println("첫번째 소수 입력");
		double aa = scanner.nextDouble();
		System.out.println("두번째 소수 입력");
		double bb = scanner.nextDouble();
		double cc = aa - bb;
		System.out.println(aa+"-"+bb+" = "+cc);
		
		System.out.println("첫번째 소수 입력");
		double aaa = scanner.nextDouble();
		System.out.println("두번째 정수 입력");
		int bbb = scanner.nextInt();
		double ccc = aaa - bbb;
		System.out.println(aaa+"-"+bbb+" = "+ccc);
	}
}
