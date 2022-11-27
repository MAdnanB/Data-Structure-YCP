

package com.Q2;

import java.util.ArrayList;

public class BinaryGapTest {
 
	public static void main(String[] args) {
		
		
		
		
		int count1 = solution.solvethis(1041);
		System.out.println("no of 0 : "+count1);
		int count2 = solution.solvethis(2147483647);
		System.out.println("no of 0 : "+count2);
		int count3 = solution.solvethis(21447);
		System.out.println("no of 0 : "+count3);

	}

}

class solution{
	public  static int  solvethis(int N){
		String ToBinary = Integer.toBinaryString(N);
		System.out.println(N+" "+"Binary: "+ToBinary);
		
		int longestGap = 0;
		ArrayList<Integer> onesList = new ArrayList<Integer>();
		
		for(int i =0;i<ToBinary.length();i++){
			if(ToBinary.charAt(i)=='0'){
				continue;
			}
			onesList.add(i);
		}
		
		for(int i=0;i<onesList.size()-1;i++){
			int indicesDiff = onesList.get(i+1)-onesList.get(i)-1;
			longestGap = Math.max(longestGap, indicesDiff);
		}
			
			
			
		return longestGap;
	}
}
