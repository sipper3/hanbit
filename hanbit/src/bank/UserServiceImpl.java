package bank;

public class UserServiceImpl implements UserService {

	@Override
	public String openAccount(AccountBean account) {
		// TODO Auto-generated method stub
		int accountNo = 100000 + (int)(Math.random() * 1000000);
		if(accountNo>1000000){
			accountNo = accountNo - 100000;
		}
		account.setAccountNo(accountNo);
		
		String result = "";
		result += "["+account.BANK_NAME+"] "; 
		result += account.getOwnerName()+"님의 계좌 ";
		result += accountNo+"가 개설되었습니다.";
		
		return result;
	}

	@Override
	public String searchRestMoney(int accountNo, int password, AccountBean account) {
		// TODO Auto-generated method stub
		String result = "";
		int dataAccountNo = account.getAccountNo();
		int dataPassword = account.getPassword();
		
		if(dataAccountNo == accountNo && dataPassword == password){
			result = "["+account.BANK_NAME+"] "+account.getOwnerName()+"님의 계좌에는 "+account.getRestMoney()+"원이 있습니다.";
		}else{
			result = "계좌정보가 없습니다.\n계좌번호 또는 비밀번호를 확인해주세요.";
		}
		return result;
	}

	@Override
	public String deposit(int accountNo, int password, int money, AccountBean account) {
		// TODO Auto-generated method stub
		String result = "";
		int dataAccountNo = account.getAccountNo();
		int dataPassword = account.getPassword();
		
		if(dataAccountNo == accountNo && dataPassword == password){
			int restMoney = account.getRestMoney() + money;
			account.setRestMoney(restMoney);
			
			result = "입금되었습니다.\n잔액은 "+account.getRestMoney()+"원입니다.";
		}else{
			result = "계좌정보가 없습니다.\n계좌번호 또는 비밀번호를 확인해주세요.";
		}
		
		return result;
	}

	@Override
	public String withdraw(int accountNo, int password, int money, AccountBean account) {
		// TODO Auto-generated method stub
		String result = "";
		int dataAccountNo = account.getAccountNo();
		int dataPassword = account.getPassword();
		
		if(dataAccountNo == accountNo && dataPassword == password){
			int restMoney = account.getRestMoney() - money;
			
			if(restMoney > 0){
				account.setRestMoney(restMoney);
				result = "출금되었습니다.\n잔액은 "+account.getRestMoney()+"원입니다.";
			}else{
				result = "잔액이 부족합니다.\n출금가능금액은 "+account.getRestMoney()+"원입니다.";
			}
			
		}else{
			result = "계좌정보가 없습니다.\n계좌번호 또는 비밀번호를 확인해주세요.";
		}
		
		return result;
	}

	@Override
	public String closeAccount(int accountNo, int password, AccountBean account) {
		// TODO Auto-generated method stub
		String result = "";
		int dataAccountNo = account.getAccountNo();
		int dataPassword = account.getPassword();
		
		if(dataAccountNo == accountNo && dataPassword == password){
			result = "해지되었습니다.\n잔액 "+account.getRestMoney()+"원이 반환됩니다.";
			
			account.setAccountNo(0);
			account.setPassword(0);
			account.setOwnerName("");
			account.setRestMoney(0);
			
			
		}else{
			result = "계좌정보가 없습니다.\n계좌번호 또는 비밀번호를 확인해주세요.";
		}
		return result;
	}

}
