package linkedlist;

import linkedlist.InsertAtEnd.Node;

public class InsertAlGivenPosition {
	public Node head;

	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public int getSize() {
		Node temp=head;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	public Node insertAtGivenIndex(int index,int data) {
		Node node=new Node(data);
		if(index<1||index>getSize()) {
			System.out.println("invalid index");
		}else {
		Node temp=head;
		for(int i=1;i<index-1;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		}
		return head;
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
		InsertAlGivenPosition l=new InsertAlGivenPosition();
		l.insertAtLast(1);
		l.insertAtLast(2);
		l.insertAtLast(3);
		l.insertAtGivenIndex(2, 12);
		System.out.println(l.getSize() );
		l.displayList();
	}
	
}
