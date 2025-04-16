package gofish;


public class DoubleLinkedList {
	private Node2 head;
	private Node2 tail;
	
	public DoubleLinkedList() {
		head=null;
		tail=null;
	}
	
	public void add(Object dataToAdd) {
		if(head==null&&tail==null) {
			Node2 newNode=new Node2(dataToAdd);
			head=newNode;
			tail=newNode;
		}
		else {
			Node2 newnode=new Node2(dataToAdd);
			newnode.setPrev(tail);
			tail=newnode;
		}
	}
	
	public int size() {
		int count=0;
		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			Node2 temp=head;
			while(temp!=null) {
				count++;
				temp=temp.getNext();
			}
		}
		return count;
	}
	public boolean search(Object data) {
		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			Node2 temp=head;
			while(temp!=null) {
				if(data==temp.getData())
					return true;
				temp=temp.getNext();
			}
		}
		return false;
	}

	public void display() {
		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			Node2 temp=head;
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
			}
			System.out.println();
		}
	}
	public void sortedAdd(Object data) {
	    Node2 newNode = new Node2(data);

	    // Başlangıç durumu kontrolü
	    if (head == null || (Integer)data < (Integer)head.getData()) {
	        newNode.setNext(head);
	        if (head != null) {
	            head.setPrev(newNode);
	        }
	        head = newNode;
	        return;
	    }

	    Node2 current = head;

	    // Listenin sonuna kadar döngü
	    while (current.getNext() != null && (Integer)data > (Integer)current.getData()) {
	        current = current.getNext();
	    }

	    // Listenin sonuna ekleme
	    if (current.getNext() == null && (Integer)data > (Integer)current.getData()) {
	        current.setNext(newNode);
	        newNode.setPrev(current);
	    } 
	    // Listenin ortasına veya başına ekleme
	    else {
	        Node2 prev = current.getPrev();
	        newNode.setNext(current);
	        newNode.setPrev(prev);
	        current.setPrev(newNode);
	        if (prev != null) {
	            prev.setNext(newNode);
	        } else {
	            head = newNode;
	        }
	    }
	}
}