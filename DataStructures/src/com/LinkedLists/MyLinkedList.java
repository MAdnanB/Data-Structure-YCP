package com.LinkedLists;

public class MyLinkedList {
	
	private int data;
	private MyLinkedList next;
	
	
	public MyLinkedList(int data) {
		super();
		this.data = data;
	}
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public MyLinkedList getNext() {
		return next;
	}
	public void setNext(MyLinkedList next) {
		this.next = next;
	}
	
 
	
}
