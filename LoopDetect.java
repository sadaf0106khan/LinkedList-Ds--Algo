package linkedlist;

public class LoopDetect {

	private Node head;
	
	private class Node{
		int data;
		Node next;
		private Node(int data) {
			this.data=data;
		}
	}//inner class close
	
	public void insertElement() {
		//Node head=new Node(12);
		Node first=new Node(121);
		Node second=new Node(122);
		Node third=new Node(123);
		Node fourth=new Node(124);
		Node fifth=new Node(125);
		Node sixth=new Node(126);
		
		       head=first;
		 first.next=second;
		second.next=third;
		 third.next=fourth;
		fourth.next=fifth;
		 fifth.next=sixth;
		 sixth.next=fourth;
		
	}
	
	public boolean isThereLoop() {
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		LoopDetect l=new LoopDetect();
		l.insertElement();
		System.out.println(l.isThereLoop());
	}
	
	
}//outer class close
