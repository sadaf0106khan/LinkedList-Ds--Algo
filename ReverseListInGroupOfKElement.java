package linkedlist;


public class ReverseListInGroupOfKElement {
	private Node head;

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node insertAtLast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return head;
		} else {
			Node tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
			return head;
		}
	}
	
	public Node reverseByKNode(int k) {
		k=k%length();
		if(k==0)
			return head;
		
		Node curr=head;
		Node next=null;
		Node prev=null;
		int i=0;
		while(i++<k) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node temp=curr;
		
		head=prev;
		
		Node tmp=head;
		while(tmp.next!=null) {
			tmp=tmp.next;
		}tmp.next=temp;
		return head;
	}

	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print(temp);
		System.out.println();
	}

	public int length() {
		int count = 0;
		if (head == null)
			return 0;
		else {
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	
	public static void main(String[] args) {
		ReverseListInGroupOfKElement l=new ReverseListInGroupOfKElement();
		l.insertAtLast(1);
		l.insertAtLast(2);
		l.insertAtLast(3);
		l.insertAtLast(4);
		l.insertAtLast(5);
		l.insertAtLast(6);
		l.display();
		l.reverseByKNode(10);
		l.display();
	}
}
