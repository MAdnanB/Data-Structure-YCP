package com.Q5;



public class BusQueue {
	static class Node{
		private Passenger p;
		protected Node next;
		
		public Node(Passenger p) {
			this.p = p;
			this.next = null;
		}

		public Passenger getData() {
			return p;
		}

		public void setData(Passenger p) {
			this.p = p;
		}
		
		
		
	}
	
	private Node front,rear,temp;
	private int length=0;

	
	
	public void Enqueue(Passenger addp){
		Node new_node = new Node(addp);
		if(front==null){
			front = new_node;
		}
		else{
			rear.next = new_node;
		}
		rear = new_node;
		length++;
//		System.out.println("Enqueued");
	}
	
	public void EnqueueAtFront(Passenger addp){
		Node new_node = new Node(addp);
		if(front==null){
			front = new_node;
		}
		new_node.next=front;
		front=new_node;
		length++;
	}

	public void show(){
		if(front==null){
			System.out.println("que is Empty");
		}
		else{
			temp=front;
			while(temp!=null){
				System.out.println(temp.p);
				temp = temp.next;
			}
		}
	}
	
	public void Dequeue(){
		if(front == null){
			System.out.println("Que is empty");
		}
		else{
			Passenger result = front.p;
			front = front.next;
			length--;
			System.out.println(result);
		}
	}

}
