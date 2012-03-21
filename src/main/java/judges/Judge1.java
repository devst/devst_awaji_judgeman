package judges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import features.Answer1;


public class Judge1 extends Judge<Answer1> {

	@Test
	public void test1() {
		assertThat(sut.plus(1, 2), is(3));
	}

	@Test
	public void test2() {
		assertThat(sut.plus(1, 3), is(4));
	}

}
