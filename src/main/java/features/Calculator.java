package features;

/**
 * 計算機。
 * 数式は正の整数、演算子一つ、四則演算のみとする。
 * 小数点以下が続く場合、第四位を四捨五入する。
 */
public interface Calculator {

	/**
	 * 数式を実行し、計算結果を返す。
	 * @param formula 数式
	 * @return 計算結果
	 */
	String execute(String formula);
}
