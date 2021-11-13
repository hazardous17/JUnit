package edu.augustana.csc305.labs;

import static org.junit.Assert.*;

import org.junit.Test;


public class HannaldousTest {
	

	
	
	@Test
	public void howbadest() {
		String[] b = {"bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat"};
		int s = Hannaldous.howbad(8 , b);
		assertEquals(6, s);
	}
	
	@Test
	public void givenintegeroftypestring_retursn() {
		String s = Hannaldous.Help("123");
		assertEquals("n", s);
	}
	
	@Test
	public void givenintegeroftypestring_retursy() {
		String s = Hannaldous.Help("abc");
		assertEquals("y", s);
	}
	
	
}
