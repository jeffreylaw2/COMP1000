package incoming;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StringEqualityTestingTest {

	@Test
	public void testConversions() {
		Assert.assertEquals("Conversion factor",
				1000,
				StringEqualityTesting.toBaseUnit("km"),
				0.001);
		Assert.assertEquals("Conversion factor",
				0.3048,
				StringEqualityTesting.toBaseUnit("ft"),
				0.001);
		// fail("Not yet implemented");
	}

}
