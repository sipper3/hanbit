package lotto;

public interface LottoService {
	public void setLottos(LottoBean bean);
	public int[][] getLottos();
	public boolean isDuplication(int count, int num);
	public void sort(int count);
	public void count(LottoBean bean);
}
