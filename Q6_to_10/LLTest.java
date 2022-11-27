package com.Q6_to_10;





public class LLTest {
	/*Q6. Add node at the beginning in the singly linked list.
	Q7. Add node at the end of the singly list.
	Q8. Count items of singly linked list*/

	//int type KLL
	public static void main(String[] args) {
		
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","John",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",75,true);
		Kite k6 = new Kite("MAGENTA","STOKES",138,true);
		MyGenericLList<Kite> KLL = new MyGenericLList<Kite>();
		
		
		KLL.add(k1);
		KLL.add(k2);
		KLL.add(k3);
		KLL.show();
		System.out.println("Length/Count is: "+KLL.count());
		
		System.out.println("---------------------------------");
		KLL.addAtBegining(k4);
		KLL.show();
		System.out.println("Length/Count is: "+KLL.count());
		
				
		/*
		System.out.println("---------------------------------");
		KLL.addAtPosition(250,4);
		KLL.show();
		System.out.println("length: "+KLL.count());
		System.out.println("---------------------------------");
		KLL.showAt(4);
		System.out.println("---------------------------------");
		KLL.DeleteFromBegining();
		KLL.show();
		System.out.println("---------------------------------");
		KLL.DeleteAtEnd();
		KLL.show();
		System.out.println("---------------------------------");
		KLL.DeleteAt(2);
		KLL.show();
		System.out.println("---------------------------------");
		KLL.showAtBegining();
		System.out.println("---------------------------------");
		KLL.showAtEnd();
*/		

	}

}
