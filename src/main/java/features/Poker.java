package features;

/**
 * ポーカー。
 * トランプのマークと番号を文字列として、5枚分を配列で渡し、その役(ハンド)を文字列として返す。
 * トランプは「マーク」+「番号」で表現する。
 * <ul>
 * <li>マーク
 * <ul>
 * <li>"S"= スペード</li>
 * <li>"H"= ハート</li>
 * <li>"C"= クローバー</li>
 * <li>"D"= ダイヤ</li>
 * </ul>
 * </li>
 * <li>番号
 * <ul>
 * <li>2~10 は数字そのまま</li>
 * <li>"J"= ジャック</li>
 * <li>"Q"= クィーン</li>
 * <li>"K"= キング</li>
 * <li>"A"= エース</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * 例:
 * <pre>
 * "SA,H2,D3,C4,S5" => "ストレート"
 * "HA,H2,S2,C2,SA" => "フルハウス"
 * </pre>
 */
public interface Poker {

	String poker(String... cards);
}
