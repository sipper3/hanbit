package bank;

public class AdminServiceImpl implements AdminService {
	
	@Override
	public String openAccount(String name, int password, int restMoney) {
		// TODO Auto-generated method stub
		
		//randomNum = 1 + (int)(Math.random() * 45);
		for (int i = 0; i < 6; i++) {
			
		}
		return null;
	}

	@Override
	public AccountBean searchAccountByAccountNo(int accountNo) {
		// TODO Auto-generated method stub
		return null;
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
