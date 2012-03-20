package answers;

import java.util.ArrayList;
import java.util.List;

import judges.Judge1;
import judges.Judge2;
import judges.Judge3;
import judges.Judge4;
import judges.Judge5;

/**
 * インデックス
 */
public class Index {

	/**
	 * @return インタフェースのリスト
	 */
	public static List<Double> getList() {
		List<Double> list = new ArrayList<Double>();
		list.add(new Double(Answer1.class, Judge1.class));
		list.add(new Double(Answer2.class, Judge2.class));
		list.add(new Double(Answer3.class, Judge3.class));
		list.add(new Double(Answer4.class, Judge4.class));
		list.add(new Double(Answer5.class, Judge5.class));
		list.add(new Double(Answer6.class, null));
		list.add(new Double(Answer7.class, null));
		return list;
	}

	public static class Double {
		public final Class<?> feature;
		public final Class<?> judgeman;

		Double(Class<?> feature,Class<?> judgeman) {
			this.feature = feature;
			this.judgeman = judgeman;
		}
	}
}
