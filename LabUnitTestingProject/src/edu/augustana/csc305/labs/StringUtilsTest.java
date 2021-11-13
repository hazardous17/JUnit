package edu.augustana.csc305.labs;


import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	
	@Test
	public void testCaesarCipherSimple() {
		String s = StringUtils.caesarCipher("ABC", 1);
		assertEquals("BCD", StringUtils.caesarCipher("ABC", 1));
		assertEquals("CDE", StringUtils.caesarCipher("ABC", 2));
		assertEquals("GOW", StringUtils.caesarCipher("EMU", 2));
	}
	
	@Test
	public void testCaesarCipherSimpleBackward() {
		assertEquals("ABC", StringUtils.caesarCipher("BCD", -1));
		assertEquals("EMU", StringUtils.caesarCipher("GOW", -2));
	}

	@Test
	public void testCaesarCipherWithSpaces() {
		String s = StringUtils.caesarCipher("THE HAPPY MOOSE", 1);
		assertEquals("UIF IBQQZ NPPTF", StringUtils.caesarCipher("THE HAPPY MOOSE", 1));
	}
	
	
	@Test
	public void testCaesarCipherMore() {
		assertEquals("", StringUtils.caesarCipher("", 10)); // always test the corner cases! 
		// ADD your own assert tests here, to find any remaining bugs in this code
	}
	
//	@Test
//	public void testCaesarCipherWithSpaces() {
//		assertEquals("UIFTHE HAPPY MOOSEIBQQZTHE HAPPY MOOSENPPTF", StringUtils.caesarCipher("THE HAPPY MOOSE", 1));
//	}


}
