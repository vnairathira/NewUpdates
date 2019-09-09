package Oracle;

public class LengthListRecursion {
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
	public int recursion(Node node) {
		if(node==null)return 0;
		return 1+recursion(node.next);
	}
	public int getCount() {
		return recursion(head);
	}
	public static void main(String[] args) {
		LengthListRecursion list =new LengthListRecursion();
		list.push(5);
		list.push(6);
		list.push(9);
		list.push(4);
		System.out.println(list.getCount());
	}
	
}
