package features;

/**
 * ローマ数字とアラビア数字を変換する。
 * ローマ数字は以下の文字の組み合わせで1から3999の数を表すものとする。
 * <pre>
 *   - 3000 = "MMM", 2000 = "MM",   1000 = "M"
 *   -  900 = "CM",   800 = "DCCC",  700 = "DCC", 600 = "DC", 500 = "D",
 *      400 = "CD",   300 = "CCC",   200 = "CC",  100 = "C"
 *   -   90 = "XC",    80 = "LXXX",   70 = "LXX",  60 = "LX",  50 = "L",
 *       40 = "XL",    30 = "XXX",    20 = "XX",   10 = "X" 
 *   -    9 = "IX",     8 = "VIII",    7 = "VII",   6 = "VI",   5 = "V",
 *        4 = "IV",     3 = "III",     2 = "II",    1 = "I"
 * </pre>
 * ローマ数字には、4を"IIII"と表す、9を"VIIIII"と表すなど、上記以外の表記が存在するが対応しない。
 * 小文字表記("vii"など)には対応しない。
 */
public interface RomanConverter {

	/**
	 * アラビア数字に変換する。
	 * @param roman ローマ数字
	 * @return アラビア数字
	 */
	int toArabic(String roman);
}
