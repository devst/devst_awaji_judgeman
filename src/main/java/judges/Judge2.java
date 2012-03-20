package judges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import features.Answer2;


public class Judge2 {

	private Answer2 sut;

	@Test
	public void 母音() throws Exception {
		assertThat(sut.execute('a'), is("あ"));
		assertThat(sut.execute('i'), is("い"));
		assertThat(sut.execute('u'), is("う"));
		assertThat(sut.execute('e'), is("え"));
		assertThat(sut.execute('o'), is("お"));
	}
}
