package Oracle;

public class LinkedList1 {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void insertAfter(Node pre_node,int new_data) {
		if(pre_node==null) {
			System.out.println("prevoius node cannot be null");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=pre_node.next;
		pre_node.next=new_node;
	}
	public void append(int new_data) {
		Node new_node=new Node(new_data);
		if(head==null) {
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null) 
		{
			last=last.next;
		}
			last.next=new_node;
			return;
	}
	public void printList() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		LinkedList1 list=new LinkedList1();
		list.append(6);
		list.push(7);
		list.push(1);
		list.append(5);
		list.insertAfter(list.head.next, 8);
		list.printList();
		
	}
}
