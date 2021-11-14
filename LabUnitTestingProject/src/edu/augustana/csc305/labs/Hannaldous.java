package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {

	// method one to do the thing for Monday's meeting
	/* checks whether the password is bad or not depending on the length
	   and whether it contains letters or not.*/
	public static int howManyBadPasswords(int n, String[] passwords) {
		int j = passwords.length - 1;
		int numBadPswds = 0;

		for (int i = 0; i < passwords.length; i++) {
			if (passwords[j].length() < n || isStringCheck(passwords[j]).equals("y"))
				numBadPswds++;
			j--;
		}
		return numBadPswds;
	}

	// method two helps, and i wrote it at 11:58 p.m. on sunday...
	// couldn't find it on stack overflow, so I rolled my pwn.
	// Checks whether the string contains all letters or not and returns y if it contains all letters.
//	static String Help(String MAYBE) {
//		try {
//			int a = Integer.parseInt(MAYBE);
//			return "n";
//		} catch (NumberFormatException e) {
//			return "y";
//		}
//	}

	/*Checks whether the string has anything besides letters or not*/
	static String isStringCheck(String password) 
	{		
		int yeah = -1;
		while (yeah++ < password.length() - 1) {
			char letter = password.charAt(yeah); 
			if (! (letter >= 'a' && letter <='z'|| letter >='A' && letter <= 'Z')) return "n"; }
		return "y";
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(isStringCheck("bigmoose$"));
		System.out.println(isStringCheck("emusareawesome"));
		System.out.println(isStringCheck("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(howManyBadPasswords(8, passwords));
	}

}
