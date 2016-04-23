package kaup;

public class KaupBean {
	
	private double weigth, height;
	private String name;
	//자동생성 Alt + Shift + S
	public void setWeight(double weight){
		this.weigth = weight;
	}
	public double getWeight(){
		return this.weigth;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return this.height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	
}
