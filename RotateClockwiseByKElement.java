package linkedlist;

public class RotateClockwiseByKElement {
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

	public Node rotate(int k) {
		k = k % length();
		if (k == 0) {
			return head;
		} 
			Node temp=head;
			int i=0;
			while(i++ < k-1) {
				temp=temp.next;
			}Node tmp=temp.next;
			
			Node newhead=tmp;
			
			temp.next=null;
			while(tmp.next!=null) {
				tmp=tmp.next;
			}tmp.next=head; 
			head=newhead;
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
		RotateClockwiseByKElement l = new RotateClockwiseByKElement();
		l.insertAtLast(12);
		l.insertAtLast(13);
		l.insertAtLast(14);
		l.insertAtLast(15);
		l.insertAtLast(16);
//		l.insertAtLast(17);
//		l.insertAtLast(18);
		l.display();
		
		l.rotate(7);
		//System.out.println(l.rotate(7).data);
		l.display();
	}
}
