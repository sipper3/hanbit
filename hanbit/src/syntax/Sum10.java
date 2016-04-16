package syntax;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 2016. 4. 16.
 * Sum10.java
 * shipper3@naver.com
 * Story : 1부터 10까지의 합
 */
public class Sum10 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i+=2){
			sum += i;
		}
		System.out.println("1부터 10까지의 홀수 합 = "+sum);
		
		sum = 0;//변수 초기화
		for(int i = 2; i <= 10; i+=2){
			sum += i;
		}
		System.out.println("1부터 10까지의 짝수 합 = "+sum);


		int loof = 0;
		sum = 0;//변수 초기화
		while(loof <= 10){
			sum +=loof;
			
			loof++;
		}
		System.out.println(sum);
	}
}
