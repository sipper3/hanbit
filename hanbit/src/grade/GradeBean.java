package grade;

public class GradeBean {
	
	// === 맴버필드 영역(스코프) ===
	private int kor, eng, math, java;//인스턴스 변수는 초기화를 하지 않는다
	private String name;
	// === 맴버필드 영역(스코프) ===

	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor(){
		return this.kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public int getEng(){
		return this.eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	public int getMath(){
		return this.math;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJava(){
		return this.java;
	}
	
	

	
}
