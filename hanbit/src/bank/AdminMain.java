package bank;

import java.util.Scanner;

public class AdminMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		AccountBean account = new AccountBean();
		AdminService adminService = new AdminServiceImpl();
		
		while(true){
			System.out.println("=== ["+account.BANK_NAME+"] 관리자서비스선택 ===");
			System.out.println("[메뉴] 1.통장계설, 2.계좌정보조회(계좌번호), 3.계좌번호조회(계좌주명), 4.계좌해지, 5. 서비스종료");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("통장개설 - 이름,비밀번호,입금액을 입력해주세요.");
				account.setOwnerName(scanner.next());
				account.setPassword(scanner.nextInt());
				account.setRestMoney(scanner.nextInt());
				
				System.out.println(adminService.openAccount(account));
				break;
			case 2: 
				System.out.println("계좌정보조회 - 계좌번호를 입력해주세요.");
				adminService.searchAccountByAccountNo(scanner.nextInt(), account);
				//System.out.println(account.getOwnerName());
				System.out.println("계좌번호:"+account.getAccountNo()+", 계좌주:"+account.getOwnerName()+", 비밀번호:"+account.getPassword()+", 잔액:"+account.getRestMoney());
				break;
			case 3: 
				System.out.println("계좌번호조회 - 계좌주를 입력해주세요.");
				break;
			case 4: 
				System.out.println("계좌해지 - 계좌번호를 입력해주세요.");
				break;
			case 5: 
				System.out.println("서비스가 종료되었습니다.");
				return;
			default:System.out.println("1 ~ 5번만 선택이 가능합니다");
				break;
			}
		}

	}

}
