package com.Q15_to_17;

public class Q17_InsertAT_DLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyGenericDLList<Character> chars = new MyGenericDLList<Character>();
		chars.add('A');
		chars.add('D');
		chars.add('N');
		chars.add('N');
		
		chars.show();
		chars.addAt('A', 4);
		System.out.println("==================");
		chars.show();

	}

}
