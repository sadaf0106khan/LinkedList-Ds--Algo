package linkedlist;

public class DeleteAtGivenIndex {
	
	private Node head;
    
	 private class Node{
		 int data;
		 Node next;
		 private Node(int data) {
			 this.data=data;
		 }
	 }
	 
	 public Node deleteAtGivenIndex(int index) {
		 if(index<1||index>getSize()) {
			  System.out.println("invalid index");
		 }
		 else if(index==1){
			 head=head.next;
			 return head;
			 
		 } 
			 else {
		 
			 Node temp=head;
			 for(int i=1;i<index-1;i++) {
				 temp=temp.next;
			 }
			 temp.next=temp.next.next;
			 return head;
		 }
		 return head;
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
		DeleteAtGivenIndex l=new DeleteAtGivenIndex();
		//l.displayList();
		l.insertAtLast(19);
		l.insertAtLast(20);
		l.insertAtLast(1);
		l.insertAtLast(29);
		l.displayList();
		System.out.println();
		l.deleteAtGivenIndex(1);
		
		l.displayList();
	}
}
