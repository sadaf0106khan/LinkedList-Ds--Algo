package linkedlist;



public class DeleteAtFirst {
	private Node head;
	    
	 private class Node{
		 int data;
		 Node next;
		 private Node(int data) {
			 this.data=data;
		 }
	 }
	 
	 public Node deleteAtStart() {
		 if(head==null)
			 return null;
		 else {
			 head=head.next;
			 return head;
		 }
	 }
	public Node insertAtLast(int data) {
		Node node =new Node(data);
		if(head==null) {
			head=node;
			return head;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}temp.next=node;
			node.next=null;
			return head;
		}
		//return head;
	}
	
	public void displayList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print(temp);
	}
	
	public static void main(String[] args) {
		DeleteAtFirst l=new DeleteAtFirst();
		l.displayList();
		l.insertAtLast(19);
		l.insertAtLast(20);
		l.insertAtLast(1);
		l.insertAtLast(29);
		l.displayList();
		System.out.println();
		l.deleteAtStart();
		
		l.displayList();
	}
	
}
