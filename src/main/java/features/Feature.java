package features;

import java.util.ArrayList;
import java.util.List;

import judges.CalculatorJudge;
import judges.CoinJudge;
import judges.EnqueteJudge;
import judges.FizzBuzzJudge;
import judges.Judge;
import judges.MyersJudge;
import judges.PokerJudge;
import judges.RomanConverterJudge;
import judges.TsurukamezanJudge;

public enum Feature {

	ENQ("目標", Enquete.class, EnqueteJudge.class),

	Q1("FizzBuzz", FizzBuzz.class, FizzBuzzJudge.class),
	Q7("Myers", Myers.class, MyersJudge.class),
	Q2("計算機", Calculator.class, CalculatorJudge.class),
	Q6("鶴亀算", Tsurukamezan.class, TsurukamezanJudge.class),

	Q3("ポーカー", Poker.class, PokerJudge.class, false),
	Q4("数字変換", RomanConverter.class, RomanConverterJudge.class, false),
	Q5("コイン", Coin.class, CoinJudge.class, false),
	;
	public final String label;
	public final Class<?> feature;
	public final Class<? extends Judge<?>> judge;
	public final boolean visible;

	<T> Feature(String label, Class<T> feature, Class<? extends Judge<T>> judge, boolean visible) {
		this.label = label;
		this.feature = feature;
		this.judge = judge;
		this.visible = visible;
	}

	<T> Feature(String label, Class<T> feature, Class<? extends Judge<T>> judge) {
		this(label, feature, judge, true);
	}

	@Override
	public String toString() {
		return label;
	}

	public static List<Feature> getVisibleList() {
		List<Feature> features = new ArrayList<Feature>();
		for (Feature f : Feature.values()) {
			if (f.visible) features.add(f);
		}
		return features;
	}
}
