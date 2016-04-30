package bank;

import java.util.Scanner;

import kaup.KaupBean;
import kaup.KaupService;
import kaup.KaupServiceImpl;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		AccountBean account = new AccountBean();
		AdminService service = new AdminServiceImpl();
		
		while(true){
			System.out.println("=== 서비스선택 ===");
			System.out.println("[메뉴] 1.통장계설, 2.계좌정보조회(계좌번호), 3.계좌번호조회(계좌명), 4.계좌해지, 5. 서비스종료");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("이름,비밀번호,입금액");
				account.setOwnerName(scanner.next());
				account.setPassword(scanner.nextInt());
				account.setRestMoney(scanner.nextInt());
				
				service.openAccount(account.getOwnerName(), account.getPassword(), account.getRestMoney());
				//System.out.println(service.openAccount(service.getIndex(kaup)));
				break;
			case 2: 
				System.out.println("시스템 종료입니다");
				return;
			case 3: 
				System.out.println("시스템 종료입니다");
				return;
			case 4: 
				System.out.println("시스템 종료입니다");
				return;
			case 5: 
				System.out.println("서비스가 종료되었습니다.");
				return;
			default:System.out.println("1 ~ 5번만 선택이 가능합니다");
				break;
			}
		}

	}

}
