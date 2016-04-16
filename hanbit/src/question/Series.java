package question;
/**
 * @DATE : 2016. 4. 16.
 * @FILE : Series.java
 * @AUTH : pakjkwan@gmail.com
 * @STORY : 수열 문제
 */
public class Series {
	/**
	 * [문제] 1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합계 [변수] i : 항 d : 공차 sum : 합계
	 * [결과] ======================================================
	 * 1+2+4+7+11+16+22+... 증가하는 수열의 20번째 항까지 합
	 * ====================================================== 1350
	 * =======================================================
	 */
	public static void main(String[] args) {
		int i = 0, d = 1, sum = 1, total = 0;

		while (d <= 20) {
			// 이 부분을 코딩하여 완성하시오
			System.out.print(sum+"+"+d+" = ");
			sum += d;
			System.out.println(sum);
			
			
			d++;
		}
	}
}
