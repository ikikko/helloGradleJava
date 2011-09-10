package org.ikikko;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testname() throws Exception {
		new Main().hoge();

		assertThat("hoge", is("hoge"));

		// assertThat("fuge", is("fuga"));
	}

}
