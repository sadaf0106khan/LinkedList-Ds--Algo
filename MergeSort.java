package linkedlist;

class Node{
	int data;
	Node next;
}

class  LinkedList{
	
	
	public Node getNode(int data) {
		Node a=new Node();
		a.data=data;
		a.next=null;
		return a;
	}
	
	
	public Node insert(int data,Node node) {
		if(node==null) {
			return getNode(data);
		}else {
			node.next=insert(data,node.next);
		}
		return node;
	}
	
	public Node middleNode(Node node) {
		if(node==null)
			return null;
		Node slow=node;
		Node fast=node.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public Node mergeSort(Node node) {
		if(node==null||node.next==null)
			return node;
		
		Node middle=middleNode(node);
		Node secondhalf=middle.next;
		middle.next=null;
		
		return merge(mergeSort(node),mergeSort(secondhalf));
		
	}
	public Node merge(Node a,Node b) {
		Node temp=new Node();
		Node finallist=temp;
		
		while(a!=null&&b!=null) {
			if(a.data<b.data) {
				temp.next=a;
				a=a.next;
			}
			else{
				temp.next=b;
				b=b.next;
				
			}
			temp=temp.next;
		}
		temp.next=(a==null)?b:a;
		return finallist.next;
		
		
	}
	
	public void display(Node node) {
		if(node==null)
			System.out.print(node);
		else {
			System.out.print(node.data+"-->");
			display(node.next);
		}
	}
}

public class MergeSort {

	
	public static void main(String[] args) {
		
	
	Node head=null;
	LinkedList l=new LinkedList();
	head=l.insert(12,head);
	head=l.insert(9,head);
	head=l.insert(-37,head);
	head=l.insert(4,head);
	head=l.insert(-54,head);
	head=l.insert(6,head);
	l.display(head);
	System.out.println();
	Node sortedlist=l.mergeSort(head);
	l.display(sortedlist);
	}
	
}