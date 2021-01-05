package linkedlist;



public class InsertAtEnd {
	public Node head;

	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
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
		InsertAtEnd l=new InsertAtEnd();
		l.insertAtLast(12);
		l.insertAtLast(122);
		l.insertAtLast(1222);
		l.insertAtLast(12222);
		l.insertAtLast(122222);
		l.displayList();
	}
}
