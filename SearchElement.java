package linkedlist;


public class SearchElement {
	private Node head;
	private class Node{
		int data;
		Node next;
		private Node(int data) {
			this.data=data;
		}
	}
	
	public boolean searchElement(int key) {
		Node temp=head;
		if(temp!=null&&temp.data==key) {
			return true;
		}
		while(temp!=null&&temp.data!=key) {
			
			if(temp.data==key)
				return true;
			temp=temp.next;
		}
		if(temp==null)
			return false;
		return true;
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
		SearchElement l=new SearchElement();
		l.insertAtLast(19);
		l.insertAtLast(20);
		l.insertAtLast(1);
		l.insertAtLast(29);
		l.insertAtLast(30);
		l.insertAtLast(32);
		l.insertAtLast(33);
		l.displayList();
		System.out.println(l.searchElement(322));
	}
}
