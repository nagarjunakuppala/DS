package info.uhcl.edu;

class Node {
	Node next;
	Object data;
	Node(Object data){
		this.data = data;
	}
	
}
 class LinkedList{
	Node head;
	
	public void addList(Object obj){
		if(head==null){
			head = new Node(obj);
			return;
		}
		Node current = head;
		while(current.next !=null){
			current = current.next;
		}
		current.next = new Node(obj);
	}
	
	public void deleteList(Object obj){
		if(head ==  null){
			return;
		}
		if(head.data == obj){
			head = head.next;
		}
		
		Node current = head;
		while(current.next != null){
			if(current.next.data == obj){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	public void printList(){
		Node n = head;
		while(n !=null){
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	

}

 
 public class LinkedListTest{
	 public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addList(1);
		l.addList(2);
		l.addList(3);
		l.addList(4);
		
		l.printList();
		
		l.deleteList(2);
		
		l.printList();
	
		 
		 
	}
 }