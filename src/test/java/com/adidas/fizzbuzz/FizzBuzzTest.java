package com.adidas.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void getValueTest() {
		assertEquals("It must return the same value", "1", FizzBuzz.getValue(1));
	}

}
