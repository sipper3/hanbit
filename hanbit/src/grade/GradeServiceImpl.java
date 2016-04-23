package grade;

public class GradeServiceImpl implements GradeService{

	@Override
	public int getTotal(GradeBean grade) {
		// TODO Auto-generated method stub
		int total = grade.getKor() + grade.getEng() + grade.getMath() + grade.getJava();
		return total;
	}

	@Override
	public int getAvg(GradeBean grade) {
		// TODO Auto-generated method stub
		int avg = (this.getTotal(grade)) / 4;
		return avg;
	}

	@Override
	public String getGrade(GradeBean grade) {
		// TODO Auto-generated method stub
		String result = "";
		
		switch (this.getAvg(grade) / 10) {
			case 10:
				result = "A";
				break;
			case 9:
				result = "A";
				break;
			case 8:
				result = "B";
				break;
			case 7:
				result = "C";
				break;
			case 6:
				result = "D";
				break;
			case 5:
				result = "E";
				break;
			default:
				result = "F";
				break;
		}
		return result;
	}
	
}
