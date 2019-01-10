package jUnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SquareTest {

	@Test
	public void test() {
		JUnitTesting jUnitTesting = new JUnitTesting();
		int square = jUnitTesting.square(5);
		assertEquals(25, square);
	}

}
