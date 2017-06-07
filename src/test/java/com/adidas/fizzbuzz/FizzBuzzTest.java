package com.adidas.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void getValueTest() {
		assertEquals("It must return the same value", "1", FizzBuzz.getValue(53));
		assertEquals("It must return Fizz if the number is divisible by 3", "Fizz", FizzBuzz.getValue(9));
		assertEquals("It must return Buzz if the number is divisible by 5", "Buzz", FizzBuzz.getValue(25));
		assertEquals("It must return FizzBuzz if the number is divisible by 3 and 5", "FizzBuzz", FizzBuzz.getValue(30));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void getLowBoundaryValueTest() {
		FizzBuzz.getValue(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void getHighBoundaryValueTest() {
		FizzBuzz.getValue(101);
	}
	
	@Test(expected = NumberFormatException.class)
	public void getNullValueTest() {
		FizzBuzz.getValue(null);
	}

}
