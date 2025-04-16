package gofish;



public class SingleLinkedList {
	Node head;
	
	public void sortedAdd(Object data) {
	    Node newnode = new Node(data);

	    if (head == null || (Integer)data < (Integer)head.getData()) {
	        newnode.setLink(head);
	        head = newnode;
	        return;
	    }

	    Node temp = head;
	    Node previous = null;

	    while (temp != null && (Integer)data > (Integer)temp.getData()) {
	        previous = temp;
	        temp = temp.getLink();
	    }

	 
	    if (temp == null) {
	        previous.setLink(newnode);
	    } 
	  
	    else {
	        newnode.setLink(temp);
	        if (previous != null) {
	            previous.setLink(newnode);
	        } else {
	            head = newnode;
	        }
	    }
	}
	public void unSortedAdd(Object data) {
		if(head==null) {
			Node newnode=new Node(data);
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.getLink()!=null) {
				temp=temp.getLink();
			}
			Node newnode=new Node(data);
			temp.setLink(newnode);
		}
		
		
	}


	public int size() {
		if(head==null)
			return 0;
		else {
			int count=0;
			Node temp=head;
			while(temp!=null) {
				temp=temp.getLink();
				count++;
			}
			return count;
		}
	}
	public void display() {
		if(size()==0)
			return;
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.getData()+" ");
				temp=temp.getLink();
				
			}
		}
	}
	public void delete(Object dataToDelete) {
		if(head==null) {
			return;
		}
		else {
			Node currentNode = head;
			Node prevNode = null;
			while(currentNode != null) {
				if(currentNode.getData()==(dataToDelete)) {
					if(prevNode == null) {
						head = head.getLink();
						currentNode = head;
					}
					else {
						prevNode.setLink(currentNode.getLink());
						currentNode = currentNode.getLink();					}
				}
				else {
					prevNode = currentNode;
					currentNode = currentNode.getLink();
				}
			}
			
		}
	}
	public boolean search(Object item) {
		boolean flag=false;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				if(item==temp.getData()) {
					flag=true;
				}
				temp=temp.getLink();
			}
		}
		return flag;
	}
	
	
	public void deleteFirstElement(Object dataToDelete) {
	   if(head==null) {
		   return;
	   }
	   else {
		   if((Integer)head.getData()==(Integer)dataToDelete) {
			   head=head.getLink();
		   }
		   else {
			   Node temp=head;
			   Node previous=null;
			   while(temp!=null) {
				   if((Integer)head.getData()==(Integer)dataToDelete) {
					   previous.setLink(temp.getLink());
					   break;
				   }
				   previous=temp;
				   temp=temp.getLink();
			   }
		   }
	   }
	}



	public boolean isEmpty() {
		if(head==null&&size()==0)
			return true;
		else {
			return false;
		}
	}
	

	
	
	
	
}