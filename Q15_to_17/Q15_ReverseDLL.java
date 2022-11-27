package com.Q15_to_17;

public class Q15_ReverseDLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyGenericDLList<Character> chars = new MyGenericDLList<Character>();
		chars.add('A');
		chars.add('D');
		chars.add('N');
		chars.add('A');
		chars.add('N');
		chars.add('S');
		chars.show();
		chars.reverseShow();
		chars.DeleteAtEnd();
		chars.show();
	}

}
