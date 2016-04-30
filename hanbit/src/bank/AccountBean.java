package bank;

public class AccountBean {
	protected int accountNo; // 계좌번호
	protected String ownerName; // 계좌주인
	private int password; // 통장비번
	protected int restMoney; // 잔액
	protected static final String BANK_NAME = "한빛뱅크";
	/**
	 * 생성자를 만드시오. 
	 * 단, 통장을 만듦과 동시에 은행 이름이 통장 바깥에 새겨지며(상수) 
	 * 계좌번호는 랜덤숫자로 만들어 지며(총 * 6자리로 합시다) 
	 * 계좌주인의 이름은 새겨지며 비번도 설정합니다. 
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 * toString, 계좌생성.
	 * 
	 */
	public AccountBean(){} // 디폴트생성자
	public AccountBean(int accountNo,String ownerName,int password,int restMoney){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.password = password;
		this.restMoney = restMoney;
	}
	
	
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		/*
		int ranNo = 100000 + (int)(Math.random() * 1000000);
		if(ranNo>1000000){
			ranNo = ranNo - 100000;
		}
		
		this.accountNo = ranNo;
		*/
		this.accountNo = accountNo;
		
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getRestMoney() {
		return restMoney;
	}
	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}
	public static String getBankName() {
		return BANK_NAME;
	}
	
	
	
	

	
}
