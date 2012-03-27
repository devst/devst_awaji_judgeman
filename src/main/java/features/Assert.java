package features;

import static org.junit.Assert.fail;

public class Assert {

	public static void isFeatureImplement(Class<?> testClass,
			Class<?> mustImplement) {
		String implementName = testClass.getName().replaceAll("Test$", "");
		try {
			Class<?> c = Class.forName(implementName);
			Class<?> feature = c.asSubclass(mustImplement);
			feature.newInstance();
		} catch (ClassNotFoundException e) {
			fail(String.format("クラス [%s] を作成しましょう。", implementName));
		} catch (ClassCastException e) {
			fail(String.format("クラス [%s] にインターフェース[%s]を実装させましょう。",
					implementName, features.Enquete.class.getName()));
		} catch (InstantiationException e) {
			fail(String.format("[%s] がインスタンス化できません。"
					+ "クラスではなく、インターフェースや抽象クラス(abstract)になっていませんか？"
					+ "または、コンストラクタに引数を持たせてはいけません。",
					implementName));
		} catch (IllegalAccessException e) {
			fail(String.format(
					"クラス [%s] は引数なしのpublicコンストラクタを利用できるようにしましょう。詳細[%s]",
					implementName, e.getMessage()));
		}
	}

}
