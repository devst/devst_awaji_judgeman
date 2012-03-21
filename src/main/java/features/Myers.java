package features;

/**
 * Myersの三角形。
 * 与えられた三辺の長さに対し「正三角形」「二等辺三角形」「不等辺三角形」を表示する。
 * 三角形にならない場合は例外。
 */
public interface Myers {

	/**
	 * 三角形の名前を取得する。
	 * @param x 辺の長さ
	 * @param y 辺の長さ
	 * @param z 辺の長さ
	 * @return 三角形の名前
	 */
	String getName(int x, int y, int z);
}
