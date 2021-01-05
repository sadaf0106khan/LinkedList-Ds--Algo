package linkedlist;



public class DeleteAtEnd {
	private Node head;
    
	 private class Node{
		 int data;
		 Node next;
		 private Node(int data) {
			 this.data=data;
		 }
	 }
	 
	 public Node deleteAtEnd() {
		 if(head==null)
			 return null;
		 else {
			 Node temp=head;
			 while(temp.next.next!=null) {
				 temp=temp.next;
			 }
			 temp.next=null;
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
		DeleteAtEnd l=new DeleteAtEnd();
		l.displayList();
		l.insertAtLast(19);
		l.insertAtLast(20);
		l.insertAtLast(1);
		l.insertAtLast(29);
		l.displayList();
		System.out.println();
		l.deleteAtEnd();
		
		l.displayList();
	}
}
