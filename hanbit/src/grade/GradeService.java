package grade;

public interface GradeService {
	//총점구하기
	public int getTotal(GradeBean grade);//추상메소드
	//평균구하기
	public int getAvg(GradeBean grade);
	//학점구하기
	public String getGrade(GradeBean grade);
}
