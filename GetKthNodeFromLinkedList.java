package linkedlist;

public class GetKthNodeFromLinkedList {

	private Node head;
	
	private class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	public Node InsertAtEnd(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			return head;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
			return head;
		}
		
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}System.out.print(temp);System.out.println();
	}
	public int length() {
		int len=0;
		if(head==null)
			return 0;
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				len++;
			}
			len++;
		}
		return len;
	}
	
	public Node getKthNode(int k) {
		if(head==null) {
			System.out.println("list is empty");
		}
			int i;
			Node temp=head;
			for(i=1;i<k;i++) {
				temp=temp.next;
				if(temp==null) {
					System.out.println("k is greater then length ");
					break;
				}
			}
			return temp;
		}
	
	
	
	public static void main(String[] args) {
		GetKthNodeFromLinkedList l=new GetKthNodeFromLinkedList();
		l.InsertAtEnd(1);
		l.InsertAtEnd(1);
		l.InsertAtEnd(5);
		l.display();
		l.InsertAtEnd(11);
		l.InsertAtEnd(12);
		l.InsertAtEnd(15);
		l.InsertAtEnd(11);
		l.InsertAtEnd(12);
		System.out.println(l.length());
		System.out.println(l.getKthNode(9).data);
		
	}
}
