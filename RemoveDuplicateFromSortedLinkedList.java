package linkedlist;


public class RemoveDuplicateFromSortedLinkedList {
	private Node head;
	
	   private class Node{
		   int data;
		   Node next;
		   public Node(int data) {
			   this.data=data;
		   }//close of constructor
	   }//close of inner class
	   
	   public Node insertAtEnd(int data) {
		   Node node = new Node(data);
		   if(head==null) {
			   head=node;
			   return head;
		   }else {
			   Node temp=head;
			   while(temp.next!=null) {
				   temp=temp.next;
			   }
			   temp.next=node;
			   return head;
		   }
	   }
	   
	   public void display() {
		   Node temp=head;
		   while(temp!=null) {
			   System.out.print(temp.data+"-->");
			   temp=temp.next;
		   }
		   System.out.print(temp);
	   }
	   
	   public Node removeDuplicate() {
		   if(head==null)
			   return null;
		   else if(head.next==null)
			   return head;
		   else {
			   Node temp=head;
			   while(temp.next!=null) {
				   if(temp.data==temp.next.data) {
					   
					   temp.next=temp.next.next;
				   }
				   else {
					   temp=temp.next;
				   }
				   //temp=temp.next;
			   }
			   return head;
		   }
	   }
	  
	   public static void main(String[] args) {
		   RemoveDuplicateFromSortedLinkedList ll=new RemoveDuplicateFromSortedLinkedList();
		   ll.display();System.out.println();
		   ll.insertAtEnd(13);
		   ll.removeDuplicate();
		   ll.display();System.out.println();
		   ll.insertAtEnd(13);
		   ll.insertAtEnd(13);
		   ll.insertAtEnd(134);
		   ll.insertAtEnd(134);
		   ll.display();System.out.println();
		  ll.removeDuplicate();
		  ll.display();
	}
}//close of outer class
