package syntax;

import java.util.Scanner;

public class MaxMin2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("=== 총 인원수 설정 ===");
		int arr_cnt = scn.nextInt();
		
		System.out.println("=== 점수를 입력하면 최고점, 최저점이 출력됩니다.(만점은 100, 0점 0) ===");
		System.out.println("총 "+arr_cnt+"명의 점수만 입력이 가능합니다. 입력해주세요.");
		
		
		int max=0, min=100;
		int[] scores = new int[arr_cnt];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scn.nextInt();
			
			if(max < scores[i]) max = scores[i];
			if(min > scores[i]) min = scores[i]; 
		}
		
		System.out.println("최고점:"+max+", 최저점:"+min);
		
		
		
	}
}
