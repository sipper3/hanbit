package homework;

public class CardShuffle {
	public int[] shuffle(int[] arr) {
		if (arr == null || arr.length == 0) {
			return arr;
		} // 빈배열이면 섞는 기능 없음
		
		int tempNum = 0, randomNum = 0;
		for (int i = 0; i < arr.length; i++) { // 배열길이 만큼 섞는다.
			// 코드를 완성하시오
			randomNum = 1 + (int)(Math.random()*8);
			tempNum = arr[i];
			arr[i] = arr[randomNum];
			arr[randomNum] = tempNum;
		}
		return arr;

	}
}
