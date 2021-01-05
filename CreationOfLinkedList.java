package linkedlist;

public class CreationOfLinkedList {
	
   public Node head;

	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node insertAtStart(int data) {
		Node node =new Node(data);
		node.next=head;
		head=node;
		return head;
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
		CreationOfLinkedList l=new CreationOfLinkedList();
		l.insertAtStart(13);
		l.insertAtStart(14);
		l.insertAtStart(15);
		l.insertAtStart(16);
		l.insertAtStart(17);
		l.displayList();
	}
	
}

