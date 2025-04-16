package gofish;



public class Node2 {
	private Object data;
	private Node2 prev;
	private Node2 next;
	
	public Node2(Object dataToAdd) {
		data=dataToAdd;
		prev=null;
		next=null;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node2 getPrev() {
		return prev;
	}

	public void setPrev(Node2 prev) {
		this.prev = prev;
	}

	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}
	
}
