public class Node {
	private Node prev, next;
	private Object value;

//	public Node(Node previous, Node next, int val) {
//		this.prev = previous;
//		this.next = next;
//		this.value = val;
//	}
	public Node(Object data){
		this.value = data;
		this.next = null;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setPrev(Node previous) {
		this.prev = previous;
	}

	public Object getValue() {
		return this.value;
	}

	public Node getNext() {
		return this.next;
	}

	public Node getPrev() {
		return this.prev;
	}
}