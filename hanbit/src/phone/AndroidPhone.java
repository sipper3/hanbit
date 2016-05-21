package phone;

public class AndroidPhone extends Iphone{
	public final static String GALAXY = "갤럭시노트";
	private String size;
	private String data;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setData(String name, String size, String data){
		super.setCompany(GALAXY);
		super.setPortable(true);
		super.setCall(name);
		this.setSize(size);
		this.data = 
				super.getCompany()+"를 사용해서"
				+super.getMove()
				+super.getCall()+"에게"
				+this.size+"인치 대화면으로 카톡 '"
				+data+ "' 메시지 전달";
	}
	public String getData() {
		return data;
	}
	@Override
	public String toString() {
		return Iphone.KIND+"이기때문에 "+ this.data;
	}
}
