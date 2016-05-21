package lotto;

import java.util.Arrays;

public class Lottery {
	private int[] lotto;
	//생성자 -> 객체생성 -> 인스턴스변수 초기화
	public Lottery() {
		lotto = new int[6];
	}
	public int[] getLotto() {
		this.setLotto();
		return lotto;
	}
	public void setLotto() {
		
		for (int i = 0; i < lotto.length; i++) {
			
			for (int j = 0; j < lotto.length; j++) {
				int num = (int)(Math.random()*45+1);
				
				if(lotto[j] == num){
					continue;
				}else{
					lotto[i] = num;
					break;
				}
			}
		}
		
		Arrays.sort(lotto);

	}
	
	
	
	
	
}
