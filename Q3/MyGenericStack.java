package com.Q3;

public class MyGenericStack <T>{
	
	public  class Node{
		T t;
		Node next;
		
		public Node(T t) {
			super();
			this.t = t;
			this.next = null;
		}

		public T getData() {
			return t;
		}

		public void setData(T t) {
			this.t = t;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
	}
		
	private int length=0;
	private Node top;
	
	public int length(){
		return length;
	}
	
	public void push(T t){
		System.out.println("Data pushed");
		Node new_Node = new Node(t);
		new_Node.next = top;
		top = new_Node;
		length++;
	}
	
	

	public void pop() {
		
		T result = top.t;
		top = top.next;
		length--;
		System.out.println("Popped: "+result);
	}
	
	public void peak(){
		System.out.println(top.t);
	}
	
}
