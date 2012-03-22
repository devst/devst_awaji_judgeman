package features;

/**
 * 鶴亀算
 * 
 * 鶴と亀の全個体数と、両者の足の本数をそれぞれ正の整数で渡し、鶴と亀それぞれの個体数を文字列として返す。
 * 鶴の足は2脚、亀は4脚とし、答えは「鶴x羽、亀y匹」(x, yはそれぞれの個体数)とする。
 * 
 */

public interface Tsurukamezan {

	/**
	 * 鶴亀算の結果を返す。
	 * @param x 全個体数
	 * @param y 足の本数
	 * @return 鶴亀それぞれの個体数
	 */
	String tsurukame(int x, int y);
}
