package syntax;

import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("== 회원가입==");
		String name = scanner.next();
		System.out.println("아이디 : ");
		System.out.println("비밀번호 : ");
		System.out.println("이름 : ");
		System.out.println("생년월일(800101) : ");
		System.out.println("성인여부(성인true, 미성년false) : ");
		System.out.println("키(소숫점 첫째자리까지) : ");
		System.out.println("혈액형(A) : ");
		System.out.println(name);
		
		/*int i = scanner.nextInt();
		System.out.println(i);
		
		long li = scanner.nextLong();
		System.out.println(li);*/
	}

}
