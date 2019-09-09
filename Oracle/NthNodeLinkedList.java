package Oracle;

public class NthNodeLinkedList {
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
	public int getNthNode(int index) {
		int count =0;
		Node current=head;
		while(current!=null) {
		if(count==index) 
			return current.data;
		count++;
		current=current.next;
		}
		assert(false);
		return 0;
	}
	public static void main(String[] args) {
		NthNodeLinkedList list=new NthNodeLinkedList();
		list.push(1);
		list.push(5);
		list.push(6);
		list.push(2);
		list.push(3);
		System.out.println(list.getNthNode(2));
		
	}
}
