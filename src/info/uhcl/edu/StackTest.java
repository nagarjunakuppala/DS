package info.uhcl.edu;



class Stack{
	Node top;
	
	public void add(Object obj){
		Node node = new Node(obj);
		node.next=top;
		top = node;
	}
	
	public Object delete(){
		
		Object obj = top.data;
		top = top.next;
		return obj;
	}
	
}


public class StackTest {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		
		System.out.println(s.delete());
		
	}

}
