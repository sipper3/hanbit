package grade;

public class Grade {
	/**
	 * 합계산출 - 배열형
	 * @param scores
	 * @return
	 */
	public int getTotalArray(int[] scores){
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total;
	}
	/**
	 * 합계산출
	 * @param kor
	 * @param eng
	 * @param math
	 * @return
	 */
	public int getTotal(int kor, int eng, int math){
		int total = 0;
		total = kor + eng + math;
		return total;
	}
	/**
	 * 평균산출
	 * @param total
	 * @param cnt
	 * @return
	 */
	public double getAvg(int total, int cnt){
		double avg = 0;
		avg = total / cnt;
		return avg;
	}
	/**
	 * 등급산출
	 * @param avg
	 * @return
	 */
	public String getGrade(double avg){
		String gradeTxt = "";
		
		if(avg > 90) gradeTxt = "A";
		else if(avg > 70) gradeTxt = "B";
		else if(avg > 50) gradeTxt = "C";
		else gradeTxt = "D";
		
		return gradeTxt;
	}
}
