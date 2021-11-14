package edu.augustana.csc305.labs;

import static org.junit.Assert.*;

import org.junit.Test;


public class HannaldousTest {
	

	
	
	@Test
	public void howManyBadPasswordsTest() {
		String[] b = {"bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat"};
		int s = Hannaldous.howManyBadPasswords(8 , b);
		assertEquals(4, s);
	}
	
	@Test
	public void givenintegeroftypestring_retursntest() {
		String s = Hannaldous.isStringCheck("123");
		assertEquals("n", s);
	}
	
	@Test
	public void givenintegeroftypestring_retursytest() {
		String s = Hannaldous.isStringCheck("abc");
		assertEquals("y", s);
	}
	
	
}
