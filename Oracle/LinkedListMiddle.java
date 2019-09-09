package Oracle;

public class LinkedListMiddle {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}		
	}
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	void printMiddle() {
		Node fast_ptr=head;
		Node slow_ptr=head;
		if(head!=null) {
			while(fast_ptr!=null && fast_ptr.next!=null) {
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;
			}
			System.out.println(slow_ptr.data+" ");
		}
		
	}
	public static void main(String[] args) {
		LinkedListMiddle list=new LinkedListMiddle();
		list.push(10);
		list.push(40);
		list.push(30);
		list.push(60);
		list.push(50);
		list.printMiddle();
	}
}
