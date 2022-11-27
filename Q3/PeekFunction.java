package com.Q3;



public class PeekFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyGenericStack<Integer> ST = new MyGenericStack<Integer>();
		ST.push(10);
		ST.push(20);
		ST.push(30);
		ST.push(40);
		ST.peak();
		ST.pop();
		ST.peak();
		
		
	}

}
