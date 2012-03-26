package judges;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;

import features.Enquete;

public class EnqueteJudge extends Judge<Enquete> {

	@Test
	public void なまえ() throws Exception {
		assertThat(sut.getName(), is(notNullValue()));
	}

	@Test
	public void もくひょう() throws Exception {
		assertThat(sut.getGoal(), is(notNullValue()));
	}
}
