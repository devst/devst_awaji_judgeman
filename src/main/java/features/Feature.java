package features;

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
	Q2("計算機", Calculator.class, CalculatorJudge.class),
	Q3("ポーカー", Poker.class, PokerJudge.class),

	Q4("数字変換", RomanConverter.class, RomanConverterJudge.class),
	Q5("コイン", Coin.class, CoinJudge.class),
	Q6("鶴亀算", Tsurukamezan.class, TsurukamezanJudge.class),
	Q7("Myers", Myers.class, MyersJudge.class)

	;
	public final String label;
	public final Class<?> feature;
	public final Class<? extends Judge<?>> judge;

	<T> Feature(String label, Class<T> feature, Class<? extends Judge<T>> judge) {
		this.label = label;
		this.feature = feature;
		this.judge = judge;
	}

	@Override
	public String toString() {
		return label;
	}
}
