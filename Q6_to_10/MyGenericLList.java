package com.Q6_to_10;



public class MyGenericLList<T> {
	
	
	static class Node<T>{
		T t;
		Node<T> next;
		
		public Node(T t) {
			this.t = t;
			this.next = null;
		}
		
		
	}
	
	Node<T> head,temp,ptr;
	int count =0;
	
	public void add(T t){
		Node<T> new_Node = new Node<T>(t);
		if(head==null){
			System.out.println("First element added");
			head=new_Node;
			count++;
		}
		else{
			System.out.println("Next element added");
			temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next=new_Node;
			count++;
		}
	}
	
	public void addAtBegining(T t){
		Node<T> new_Node = new Node<T>(t);
		if(head==null){
			head=new_Node;
			count++;
		}
		else{
			new_Node.next=head;
			head=new_Node;
			count++;
		}
	}
	
	public void addAtPosition(T t,int ps){
		Node <T>new_Node = new Node<T>(t);
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the posiion to enter the list");
		int ps = sc.nextInt();*/
		temp =head;
		for(int i=0;i<ps-2;i++){
			temp = temp.next;
		}
		new_Node.next = temp.next;
		temp.next =new_Node;
		count++;
	}
	
	public void DeleteFromBegining(){
		temp=head;
		head=temp.next;
		temp=null;
		count--;
		
	}
	
	public void DeleteAtEnd(){
		
		temp = head;
		while(temp.next!=null){
			ptr=temp;
			temp=temp.next;
		}
		ptr.next=null;
		count--;
	}
	
	public void DeleteAt(int pos){
		temp = head;
		for(int i=0;i<pos-1;i++){
			ptr = temp;
			temp=temp.next;
		}
		ptr.next=temp.next;
		temp=null;
		count--;
	}
	
	public void show(){
		
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			temp = head;
			System.out.println("Printing List: ");
			while(temp!=null){
				System.out.println(temp.t);
				temp=temp.next;
			}
		}
	}
	
	public void showAtBegining(){
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			System.out.println(head.t);
		}
	}
	
	public void showAtEnd(){
		temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		System.out.println(temp.t);
	}
	
	public void showAt(int pos){
		temp = head;
		for(int i=0; i<pos-1;i++){
			temp=temp.next;
		}
		System.out.println("data at "+pos+" is: "+temp.t);
	}
	
	public int count(){
		/*temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
			}
*/		return count;
	}
	
}
