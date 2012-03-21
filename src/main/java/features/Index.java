package features;

import java.util.ArrayList;
import java.util.List;

import judges.JapaneseSyllabaryJudge;
import judges.Judge;
import judges.Judge1;
import judges.Judge3;
import judges.Judge4;
import judges.Judge5;
import judges.Judge6;
import judges.Judge7;
import judges.MyersJudge;

/**
 * インデックス
 */
public class Index {

	/**
	 * @return Entryのリスト
	 */
	public static List<Entry<?>> getList() {
		List<Entry<?>> list = new ArrayList<Entry<?>>();
		list.add(entry("足し算", Answer1.class, Judge1.class));
		list.add(entry("50音変換", JapaneseSyllabary.class, JapaneseSyllabaryJudge.class));
		list.add(entry("FizzBuzz", Answer3.class, Judge3.class));
		list.add(entry("ポーカー", Answer4.class, Judge4.class));
		list.add(entry("ローマ数字変換", Answer5.class, Judge5.class));
		list.add(entry("コイン判別", Answer6.class, Judge6.class));
		list.add(entry("鶴亀算", Answer7.class, Judge7.class));
		list.add(entry("Myersの三角形", Myers.class, MyersJudge.class));
		return list;
	}

	private static <T> Entry<T> entry(String name, Class<T> feature, Class<? extends Judge<T>> judge) {
		return new Entry<T>(name, feature, judge);
	}

	public static class Entry<T> {
		public final String name;
		public final Class<?> feature;
		public final Class<?> judgeman;

		Entry(String name, Class<T> feature,Class<? extends Judge<T>> judgeman) {
			this.name = name;
			this.feature = feature;
			this.judgeman = judgeman;
		}
	}
}
