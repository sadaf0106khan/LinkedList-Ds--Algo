package linkedlist;

public class LoopLength {

	private Node head;

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;// optional
		}// constructor
	}// node class

	public void insert() {
		Node node = new Node(12);
		Node node1 = new Node(13);
		Node node2 = new Node(14);
		Node node3 = new Node(15);
		Node node4 = new Node(16);

		head = node;
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node3;
	}

	public boolean loop() {
		if (head == null || head.next == null)
			return false;
		else {
			Node slow = head;
			Node fast = head;
			while (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;

				if (fast == slow) {
					slow = head;
					while (slow != fast) {
						slow = slow.next;
						fast = fast.next;
					}
					System.out.println("Starting point of loop: " + slow.data);
					
					Node temp=slow;
					int len=0;
					if(temp==fast) {
						while(temp.next!=fast)
						{
							temp=temp.next;
							len=len+1;
						}
						len++;
					}
					System.out.println("The length of loop is: "+len);
					
					return true;
				}
			}
		}
		
		return false;
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

	public static void main(String[] args) {
		LoopLength l = new LoopLength();
		l.insert();
		// l.display();
		System.out.println("is there any loop: "+l.loop());
		//System.out.println("the length is: "+l.length());
		// l.display();
	}

}// close of outer class
