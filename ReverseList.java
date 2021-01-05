package linkedlist;


public class ReverseList {
	private Node head;
	private class Node{
		int data;
		Node next;
		private Node(int data) {
			this.data=data;
		}
	}
	
	public Node reverseList() {
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}
	
	public void displayList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print(temp);
		System.out.println();
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
	
	
	public static void main(String[] args) {
		ReverseList l=new ReverseList();
		l.insertAtLast(19);
		l.insertAtLast(20);
		l.insertAtLast(1);
		l.insertAtLast(29);
		l.displayList();
		l.reverseList();
		l.displayList();
	}
}
