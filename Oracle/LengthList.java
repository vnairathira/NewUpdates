package Oracle;

public class LengthList {
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
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public int getCount() {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		LengthList list=new LengthList();
		list.push(1);
		list.push(5);
		list.push(6);
		System.out.println(list.getCount());
	}
	
}
