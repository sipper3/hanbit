package lotto;

public class LottoServiceImpl implements LottoService {
	int[][] lottos;
	int[] lotto;
	private int count;//금액에 따른 게임수
	
		
		
	@Override
	public void setLottos(LottoBean bean) {
		count(bean);
		this.lottos = new int[this.count][6];
		this.lotto = new int[6];
		
		if (this.count < 0) {
			this.lottos = null;
		} else {
			int i = 0;
			for (int cnt = 0; cnt < this.count; cnt++) {
				while(true){
					int num = bean.getNumber();
					if(isDuplication(cnt, num)){
						continue;
					}
					this.lottos[cnt][i] = num;
					i++;
					if(i == this.lottos[cnt].length){
						i = 0;
						break;
					}
				}
				sort(cnt);
			}
			
		}
		
	}

	@Override
	public int[][] getLottos() {
		// TODO Auto-generated method stub
		return this.lottos;
	}

	@Override
	public boolean isDuplication(int count, int num) {
		
		for (int i = 0; i < this.lottos[count].length; i++) {
			if(this.lottos[count][i] == num){
				return true;
			}
		}
		return false;
	}

	@Override
	public void sort(int count) {
		int temp = 0;
		for (int i = 0; i < this.lottos[count].length-1; i++) {
			for (int j = i+1; j < this.lottos[count].length; j++) {
				
				if(this.lottos[count][i] > this.lottos[count][j]){
					temp = this.lottos[count][i];
					this.lottos[count][i] = this.lottos[count][j];
					this.lottos[count][j] = temp;
				}
				
			}
		}
		
	}

	@Override
	public void count(LottoBean bean) {
		// TODO Auto-generated method stub
		this.count = bean.getMoney()/1000;
	}

}
