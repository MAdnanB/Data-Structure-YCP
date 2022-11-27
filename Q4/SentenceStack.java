package com.Q4;
import java.util.Scanner;


import com.Q3.MyGenericStack;


public class SentenceStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine();
		String [] words =input.split(" ");
//		char [] words = input.toCharArray();
		MyGenericStack<String> WordStack = new MyGenericStack<String>();
		
		for(int i= words.length-1;i>=0;i--){
			WordStack.push(words[i]);
		}
		
		/*//reverse push
		 for(String c: words){
			
			WordStack.push(c);
		}*/
//		String b="";
		System.out.println("========================================");
		for(int i=WordStack.length()-1;i>-1;i--){
//			 b = WordStack.pop()+" "+b; //making sentence again
			WordStack.pop();
		}
		

		/*for(int i=WordStack.length()-1;i>-1;i--){
			 b =b + " "+ WordStack.pop();
			// Reverse a string using stack
		}*/
//		System.out.println(b);

	}

}
