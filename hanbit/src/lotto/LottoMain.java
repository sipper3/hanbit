package lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		
		LottoBean bean = new LottoBean();
		LottoService service = new LottoServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 로또 시작 ===");
		System.out.println("얼마치를 구입합니까?");
		
		bean.setMoney(scanner.nextInt());
		
		service.setLottos(bean);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		
	}
}
