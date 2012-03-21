package features;

import java.util.ArrayList;
import java.util.List;

import judges.Judge1;
import judges.JapaneseSyllabaryJudge;
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
	 * @return インタフェースのリスト
	 */
	public static List<Entry> getList() {
		List<Entry> list = new ArrayList<Entry>();
		list.add(new Entry("足し算", Answer1.class, Judge1.class));
		list.add(new Entry("50音変換", JapaneseSyllabary.class, JapaneseSyllabaryJudge.class));
		list.add(new Entry("FizzBuzz", Answer3.class, Judge3.class));
		list.add(new Entry("ポーカー", Answer4.class, Judge4.class));
		list.add(new Entry("ローマ数字変換", Answer5.class, Judge5.class));
		list.add(new Entry("コイン判別", Answer6.class, Judge6.class));
		list.add(new Entry("鶴亀算", Answer7.class, Judge7.class));
		list.add(new Entry("Myersの三角形", Myers.class, MyersJudge.class));
		return list;
	}

	public static class Entry {
		public final String name;
		public final Class<?> feature;
		public final Class<?> judgeman;

		Entry(String name, Class<?> feature,Class<?> judgeman) {
			this.name = name;
			this.feature = feature;
			this.judgeman = judgeman;
		}
	}
}
