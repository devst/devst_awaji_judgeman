package judges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import answers.Answer3;

@Judge("FizzBuzz")
public class Judge3 {

	private Answer3 sut;

	@Test
	public void 三の倍数() throws Exception {
		assertThat(sut.fizzBuzz(3), is("Fizz"));
		assertThat(sut.fizzBuzz(15), is("FizzBuzz"));
	}

	public void 五の倍数() throws Exception {
		assertThat(sut.fizzBuzz(5), is("Buzz"));
	}

	public void 三と五の倍数() throws Exception {
		assertThat(sut.fizzBuzz(15), is("FizzBuzz"));
	}

	public void その他() throws Exception {
		assertThat(sut.fizzBuzz(4), is("4"));
		assertThat(sut.fizzBuzz(7), is("7"));
	}
}
