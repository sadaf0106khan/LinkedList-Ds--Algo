package linkedlist;

public class MaximumAndMinimumElement {
	
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
   
   public void maxiAndMini() {
	   int max=Integer.MIN_VALUE;
	   int min=Integer.MAX_VALUE;
	   Node temp=head;
	   while(temp!=null) {
		   if(temp.data>max) {
			   max=temp.data;
		   }
		   if(temp.data<min) {
			   min=temp.data;
		   }
		   temp=temp.next;
	   }System.out.println();
	   System.out.println("the maximum value in list "+max);
	   System.out.println("the minimum value in list "+min);
   }
   
   public static void main(String[] args) {
	   MaximumAndMinimumElement ll=new MaximumAndMinimumElement();
	   ll.display();System.out.println();
	   ll.insertAtEnd(13);
	   ll.display();System.out.println();
	   ll.insertAtEnd(14);
	   ll.insertAtEnd(15);
	   ll.insertAtEnd(16);
	   ll.insertAtEnd(17);
	   ll.display();System.out.println();
	   ll.maxiAndMini();
}
}//close of outer class
