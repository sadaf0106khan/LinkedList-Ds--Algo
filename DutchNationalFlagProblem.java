package linkedlist;


public class DutchNationalFlagProblem {
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
	
	public Node arrange() {
		int count0=0;
		int count1=0;
		int count2=0;
		if(head==null||head.next==null)
			return head;
		else {
			Node temp=head;
			
			while(temp!=null) {
				if(temp.data==0) {
					count0++;
				}else if(temp.data==1) {
					count1++;
				}else {
					count2++;
				}
				temp=temp.next;
			}
			
			}
		System.out.println(count0+" "+count1+" "+count2);
			Node temp=head;
			while(count0-->0) {
				temp.data=0;;
				temp=temp.next;
				
			}while(count1-->0) {
				temp.data=1;
				temp=temp.next;
			}while(count2-->0) {
				temp.data=2;
				temp=temp.next;
			}
			
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
		DutchNationalFlagProblem l=new DutchNationalFlagProblem();
		l.insertAtLast(1);
		l.insertAtLast(2);
		l.insertAtLast(2);
		l.insertAtLast(1);
		l.insertAtLast(0);
		l.insertAtLast(0);
		l.insertAtLast(1);
		l.display();
		l.arrange();
		l.display();
	}
}
