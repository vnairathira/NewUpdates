package Oracle;

public class LinkedListSearch {
	static Node head;
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
	public boolean searchData(Node head,int search) {
		Node current=head;
		while(current!=null) {
			if(search==current.data)
				return true;
			current=current.next;
		}
		return false;
	}
	public boolean recursiceSearch(Node head,int search) {
		if(head==null) return false;
		if(head.data==search) return true;
		
		
		return recursiceSearch(head.next,search);
	}
	public static void main(String[] args) {
		LinkedListSearch list=new LinkedListSearch();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		if(list.searchData(head,20)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		if(list.recursiceSearch(head,41)) {
			System.out.println("data is der");
		}else {
			System.out.println("search not found");
		}
	}
}
