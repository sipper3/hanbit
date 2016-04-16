package syntax;

/**
 * 2016. 4. 16.
 * MultiOf5.java
 * shipper3@naver.com
 * Story : 1부터 100까지 5의 배수의 합과 갯수
 */
public class MultiOf5 {
	/**
	 * sum : 배수의 합
	 * count : 배수의 갯수
	 * 일때 1부터 100까지의 범위내의 5의 배수의 합과 갯수를 구하시오
	 */
	public static void main(String[] args) {
		int sum = 0, count = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%5 == 0){
				count++;
				sum += i;
			}
		}
		System.out.println("1부터 100까지의 범위내의 5의 배수의 합은 "+sum+" 이고 갯수는 "+count+"이다");
	}
}
