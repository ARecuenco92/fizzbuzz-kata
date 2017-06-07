package com.adidas.fizzbuzz;

public class FizzBuzz {

	/** Low boundary value**/
	private static final int LOW_BOUNDARY = 1;
	/** High boundary value**/
	private static final int HIGH_BOUNDARY = 100;
	/** Fizz value**/
	private static final int FIZZ_VALUE = 3;
	/** Buzz value**/
	private static final int BUZZ_VALUE = 5;
	
	/**
	 * Return 'Fizz' if the number is divisible by 3
	 * Return 'Buzz' if the number divisible by 5
	 * Return 'FizzBuzz' if the number divisible by 3 & 5
	 * Otherwise, return the given number
	 * 
	 * @param number	The next number in the sequence
	 * 
	 * @return String	The right value according to the game rules
	 */
	public static String getValue(Integer number) {
		if(isNull(number)) {
			throw new NumberFormatException("The specified number is null");
		}
		else if(isOutOfBounds(number)){
			throw new IndexOutOfBoundsException("The specified number is out of bounds");
		}
		else if(isFizzBuzz(number)) {
			return "FizzBuzz";
		}
		else if(isFizz(number)) {
			return "Fizz";
		}
		else if(isBuzz(number)) {
			return "Buzz";
		}
		else {
			return number.toString();
		}
	}
	
	/**
	 * Return true if the number is null
	 * Otherwise, return false
	 * 
	 * @param number	The next number in the sequence
	 * 
	 * @return boolean 	True if the number is null
	 */
	private static boolean isNull(Integer number) {
		return number == null;
	}
	
	/**
	 * Return true if the number is not out of bounds
	 * Otherwise, return false
	 * 
	 * @param number	The next number in the sequence
	 * 
	 * @return boolean 	True if the number is not out of bounds
	 */
	private static boolean isOutOfBounds(Integer number) {
		return number < LOW_BOUNDARY || number > HIGH_BOUNDARY;
	}
	
	/**
	 * Return true if the number is fizz and buzz
	 * Otherwise, return false
	 * 
	 * @param number	The next number in the sequence
	 * 
	 * @return boolean 	True if the number is fizz and buzz
	 */
	private static boolean isFizzBuzz(Integer number) {
		return isFizz(number) && isBuzz(number);
	}
	
	/**
	 * Return true if the number is divisible by 3
	 * Otherwise, return false
	 * 
	 * @param number	The next number in the sequence
	 * 
	 * @return boolean 	True if the number is divisible by 3
	 */
	private static boolean isFizz(Integer number) {
		return number % FIZZ_VALUE == 0;
	}
	
	/**
	 * Return true if the number is divisible by 5
	 * Otherwise, return false
	 * 
	 * @param number	The next number in the sequence
	 * 
	 * @return boolean 	True if the number is divisible by 5
	 */
	private static boolean isBuzz(Integer number) {
		return number % BUZZ_VALUE == 0;
	}
}
