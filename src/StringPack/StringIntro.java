package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {

		String msg = "";
		String wordPut = "Dogs";
		Boolean running = true; // George Boole can only be true or false; binary
		String goAgain = "no";

		msg = "Hello! Welcome to my program!";
		JOptionPane.showMessageDialog(null, msg);
		
		while (running == true) {
			msg = "Please enter your string";
			wordPut = JOptionPane.showInputDialog(null, msg);

			if (wordPut == null) {
				System.exit(0);
			}

			LearnStrings getIt = new LearnStrings(wordPut);

			msg = "First char is: " + getIt.getFirstLetter();
			JOptionPane.showMessageDialog(null, msg);

			// test -- try some, test, repeat
			int lengthTest = getIt.getlength();

			msg = "Length = " + lengthTest;
			JOptionPane.showMessageDialog(null, msg);

			char lastLetter = getIt.getLastLetter();

			msg = "Last letter is " + lastLetter;
			JOptionPane.showMessageDialog(null, msg);

			/*
			 * notes start: index = 1 that will be the second char (remember index starts at
			 * 0) end: .length() - 2
			 * 
			 * use: .substring(int beginIndex, int endIndex) .substring (1, word.length()-2
			 * 
			 * indexOf(int ch) Returns the index within this string of the first occurrence
			 * of the specified character.
			 *
			 * int indexOf(int ch, int fromIndex) Returns the index within this string of
			 * the first occurrence of the specified character, starting the search at the
			 * specified index.
			 *
			 * toUpperCase() Converts all of the characters in this String to upper case
			 * using the rules of the default locale.
			 *
			 * toLowerCase() Converts all of the characters in this String to lower case
			 * using the rules of the default locale.
			 *
			 * equals(Object anObject) Compares this string to the specified object.
			 * equalsIgnoreCase(String anotherString) Compares this String to another
			 * String, ignoring case considerations.
			 */

			// AP question: What is the diff between a while, and a do-while loop?
			// do while must run at least once
			// while can run zero or many times
			msg = "middle is " + getIt.getMiddle();
			JOptionPane.showMessageDialog(null, msg);

			msg = "Do you want to try again? y/n";
			goAgain = JOptionPane.showInputDialog(null, msg);

			if (goAgain.equalsIgnoreCase("y")) {
				running = true;
			} else if (goAgain.equalsIgnoreCase("n")) {
				running = false;
				msg = "Goodbye,see ya!";
				JOptionPane.showMessageDialog(null, msg);
			} else if (goAgain.equalsIgnoreCase("yes")) {
				running = true;
			} else if (goAgain.equalsIgnoreCase("no")) {
				running = false;
				msg = "Goodbye,see ya!";
				JOptionPane.showMessageDialog(null, msg);
			} else {
				msg = "Please try again";
				JOptionPane.showMessageDialog(null, msg);
			} // end of else stack
		} // end of while loop
	}// end of void
}// end of class
