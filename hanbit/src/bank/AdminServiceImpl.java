package bank;

public class AdminServiceImpl implements AdminService {
	AccountBean[] accounts = new AccountBean[10];
	private int count;
	
	@Override
	public String openAccount(AccountBean account) {
		// TODO Auto-generated method stub
		
		int accountNo = 100000 + (int)(Math.random() * 1000000);
		if(accountNo>1000000){
			accountNo = accountNo - 100000;
		}
		account.setAccountNo(accountNo);
		
		
		accounts[count] = new AccountBean(account.getAccountNo(), account.getOwnerName(), account.getPassword(), account.getRestMoney());
		
		String result = "";
		result += "["+accounts[count].BANK_NAME+"] "; 
		result += accounts[count].getOwnerName()+"님의 계좌 ";
		result += accounts[count].getAccountNo()+"가 개설되었습니다.";
		
		
		count++;
		
		return result;
	}

	@Override
	public AccountBean searchAccountByAccountNo(int accountNo, AccountBean account) {
		// TODO Auto-generated method stub
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null && accounts[i].getAccountNo() == accountNo){
				//account = new AccountBean(accounts[i].getAccountNo(), accounts[i].getOwnerName(), accounts[i].getPassword(), accounts[i].getRestMoney());
				account.setAccountNo(accounts[i].getAccountNo());
				account.setOwnerName(accounts[i].getOwnerName());
				account.setPassword(accounts[i].getPassword());
				account.setRestMoney(accounts[i].getRestMoney());
			}
		}
		
		return account;
	}

	@Override
	public AccountBean[] searchAccountsByName(String name) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int searchCountByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
