package jUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class TestingSquare {
    @Test
    public void testingSquare(){
        JUnitTesting jUnitTesting = new JUnitTesting();
		int square = jUnitTesting.square(5);
		Assert.assertEquals(25, square);
    }

}
