package judges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import features.Answer7;

public class Judge7 extends Judge<Answer7> {

	@Test
	public void 鶴一羽() throws Exception {
		String actual = sut.tsurukame(1, 2);
		assertThat(actual, is("鶴1羽、亀0匹"));
	}

	@Test
	public void 亀一匹() throws Exception {
		String actual = sut.tsurukame(1, 4);
		assertThat(actual, is("鶴0羽、亀1匹"));
	}

	@Test
	public void 鶴八羽と亀五匹() throws Exception {
		String actual = sut.tsurukame(13, 36);
		assertThat(actual, is("鶴8羽、亀5匹"));
	}

	@Test(expected=RuntimeException.class)
	public void 計算が成立しない() throws Exception {
		sut.tsurukame(1, 3);
	}
}
