package com.Q1;

import java.util.Stack;

public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6};
		/*for (int i = a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}*/
		
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0;i<a.length;i++){
			s.push(a[i]);
//			System.out.println(a[i]);
		}

		for(int i=s.size()-1;i>=0;i--){
		System.out.print(s.pop()+" ");}
	}

}
