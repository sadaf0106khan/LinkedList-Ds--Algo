package linkedlist;


public class MiddleElement {
	private Node head;
	private class Node{
		int data;
		Node next;
		private Node(int data) {
			this.data=data;
		}
	}
	
	public Node middleElement() {
		Node slow=head;
		Node fast=head;
		Node temp=head;
		while(fast.next!=null&&fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			temp=temp.next;
		}
		
		return slow;
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
		MiddleElement l=new MiddleElement();
		l.insertAtLast(19);
		l.insertAtLast(20);
		l.insertAtLast(1);
		l.insertAtLast(29);
		l.insertAtLast(30);
		l.insertAtLast(32);
		l.insertAtLast(33);
		l.insertAtLast(430);l.insertAtLast(302);l.insertAtLast(930);
		l.displayList();
		Node middle=l.middleElement();
		System.out.println(middle.data);
	}
}
