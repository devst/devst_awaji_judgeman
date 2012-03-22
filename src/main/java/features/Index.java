package features;

import java.util.ArrayList;
import java.util.List;

import judges.CalculatorJudge;
import judges.FizzBuzzJudge;
import judges.Judge;
import judges.PokerJudge;
import judges.RomanConverterJudge;
import judges.CoinJudge;
import judges.TsurukamezanJudge;
import judges.MyersJudge;

/**
 * インデックス
 */
public class Index {

	/**
	 * @return Featureのリスト
	 */
	public static List<Feature<?>> getList() {
		List<Feature<?>> list = new ArrayList<Feature<?>>();
		list.add(entry("計算機", Calculator.class, CalculatorJudge.class));
		list.add(entry("FizzBuzz", FizzBuzz.class, FizzBuzzJudge.class));
		list.add(entry("ポーカー", Poker.class, PokerJudge.class));
		list.add(entry("ローマ数字変換", RomanConverter.class, RomanConverterJudge.class));
		list.add(entry("コイン判別", Coin.class, CoinJudge.class));
		list.add(entry("鶴亀算", Tsurukamezan.class, TsurukamezanJudge.class));
		list.add(entry("Myersの三角形", Myers.class, MyersJudge.class));
		return list;
	}

	private static <T> Feature<T> entry(String name, Class<T> feature, Class<? extends Judge<T>> judge) {
		return new Feature<T>(name, feature, judge);
	}

	public static class Feature<T> {
		public final String name;
		public final Class<T> type;
		public final Class<? extends Judge<T>> judgeman;

		Feature(String name, Class<T> feature, Class<? extends Judge<T>> judgeman) {
			this.name = name;
			this.type = feature;
			this.judgeman = judgeman;
		}
	}
}
