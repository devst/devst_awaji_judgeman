package judges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import features.Answer4;


public class Judge4 {

	private Answer4 sut;

	@Test
	public void ストレートフラッシュ() throws Exception {
		assertThat(sut.poker("S3", "S4", "S5", "S6", "S7"), is("ストレートフラッシュ"));
	}
}
