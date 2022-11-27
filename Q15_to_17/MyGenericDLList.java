package com.Q15_to_17;

public class MyGenericDLList<T> {
public MyGenericDLList() {
		
	}
 private static class Node<T>
	 {
		private T t;
		private Node<T> next,prev;
		
		public Node(T A) {
			
			this.t = A;
			this.next = null;
			this.prev = null;
		}

		public T getA() {
			return t;
		}

		public void setA(T A) {
			this.t = A;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
		
	 }
 
 private Node<T> head,tail,temp,ptr;
 
 public void add(T t){
	 Node<T> new_node = new Node<T>(t);
	 if(head==null){
		 System.out.println("First element added");
		 head = new_node;
		 tail= new_node;
		 head.next = null;
		 head.prev = null;
		 /*System.out.println("head: "+head);
		 System.out.println("tail: "+tail);
		 System.out.println("head.next: "+head.next);
		 System.out.println("head.prev: "+head.prev);*/
	 }
	 else{ //adding using tail
		 System.out.println("Next Element added");
		 tail.next = new_node;
		 new_node.prev = tail;
		 tail = new_node;
		 new_node.next = null;
		 
	 }
	 
	 /*else{ //adding using head
		 System.out.println("Next Element added");
		 temp = head;
		 while(temp.next!=null){
			 temp=temp.next;
		 }
		 new_node.prev = temp;
		 temp.next = new_node;
		 tail = new_node;
		 new_node.next = null;
		 
		 System.out.println(head);
		 System.out.println(new_node.prev);
		System.out.println(temp.next );
		 System.out.println(tail );
		 System.out.println(new_node.next );
		 
	 }*/
 }

 public void addAtBegining(T t){
	 Node<T> new_node = new Node<T>(t);
	 if(head==null){
		 System.out.println("First element added");
		 head = new_node;
		 tail= new_node;
		 head.next = null;
		 head.prev = null;
	 }
	 else{
		 new_node.next = head;
		 head.prev = new_node;
		 head = new_node;
		 new_node.prev = null;
	 }
 }
 
 public void addAt(T t, int pos){
	 Node<T> new_node = new Node<T>(t);
	 if(head==null){
		 System.out.println("First element added");
		 head = new_node;
		 tail= new_node;
		 head.next = null;
		 head.prev = null;
	 }
	 else{
		 temp = head;
		 for(int i=0;i<pos-1;i++){
			 ptr=temp;
			 temp= temp.next;
		 }
		 new_node.next = temp;
		 new_node.prev = ptr;
		 ptr.next = new_node;
		 temp.prev = new_node;
	 }
 }
 
public void show(){
	if(head==null){
		System.out.println("List is empty");
	}
	else{
		System.out.println("Printing List....");
		temp =head;
		while(temp!=null){
			System.out.println(temp.t);
			temp = temp.next;
		}
	}
}
 
public void reverseShow(){
	if(tail==null){
		System.out.println("List is empty");
	}
	else{
		System.out.println("printing list in reverse order");
		temp = tail;
		while(temp!=null){
			System.out.println(temp.t);
			temp = temp.prev;
		}
	}
}

public void showAtEnd(){
	if(head==null || tail == null){
		System.out.println("List is empty");
	}
	System.out.println(tail.t);
}

public void showAtBegining(){
	if(head==null){
		System.out.println("List is empty");
	}
	System.out.println(head.t);
}

public void DeleteAtEnd(){
	tail = tail.prev;
	tail.next = null;
}

public void DeleteAtBegining(){
	head = head.next;
	head.prev = null;
}

public int length(){
	temp=head;
	int length=0;
	while(temp!=null){
		length++;
		temp=temp.next;
		}
	return length;
}

}
