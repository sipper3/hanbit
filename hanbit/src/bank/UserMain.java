package bank;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		AccountBean account = new AccountBean();
		UserService userService = new UserServiceImpl();
		
		while(true){
			System.out.println("=== ["+account.BANK_NAME+"] 서비스선택 ===");
			System.out.println("[메뉴] 1.통장개설, 2.잔액조회, 3.입금, 4.출금, 5.계좌해지, 6.서비스종료");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("통장개설 - 이름,비밀번호,입금액을 입력해주세요.");
				account.setOwnerName(scanner.next());
				account.setPassword(scanner.nextInt());
				account.setRestMoney(scanner.nextInt());
				
				System.out.println(userService.openAccount(account));
				
				break;
			case 2: 
				System.out.println("잔액조회 - 계좌번호, 비밀번호를 입력해주세요.");
				System.out.println(userService.searchRestMoney(scanner.nextInt(), scanner.nextInt(), account));
				break;
			case 3: 
				System.out.println("입금 - 계좌번호, 비밀번호, 입금액을 입력해주세요.");
				System.out.println(userService.deposit(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), account));
				break;
			case 4: 
				System.out.println("출금 - 계좌번호, 비밀번호, 출금액을 입력해주세요.");
				System.out.println(userService.withdraw(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), account));
				break;
			case 5: 
				System.out.println("계좌해지 - 계좌번호, 비밀번호를 입력해주세요.");
				System.out.println(userService.closeAccount(scanner.nextInt(), scanner.nextInt(), account));
				break;
			case 6: 
				System.out.println("서비스가 종료되었습니다.");
				return;
			default:System.out.println("1 ~ 6번만 선택이 가능합니다");
				break;
			}
		}

	}

}
