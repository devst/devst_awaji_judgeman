package answers;

/**
 * どのコインを使うか
 * 
 * 金額を正の整数で指定して、その金額を実現するために必要なコイン枚数が最小となる組み合わせを文字列として返す。
 * コイン枚数が1枚の場合は枚数は不要で、2枚以上の場合はコインの金額+枚数とする。
 * また、金額の異なるコインで実現する場合は、金額の大きい順として、各コイン+枚数の間を「と」で繋げる。
 * 使えるコインは日本の硬貨500円玉、100円玉、50円玉、10円玉、5円玉、1円玉とする。
 * 
 * 例)
 * 30円だと「10円玉3枚」, 60円だと「50円玉と10円玉」, 120円だと「100円玉と10円玉2枚」
 * 
 */

public interface Answer6 {

	String coinUsage(int amount);

}
