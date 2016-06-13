
public class LinkedList {
	private Node head;
	int listCount;
	// , tail, current;

	public LinkedList() {
		head = new Node(null);
		listCount = 0;
	}

	public void add(Object data) {
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
		while (crunchifyCurrent.getNext() != null) {
			crunchifyCurrent = crunchifyCurrent.getNext();
		}
		crunchifyCurrent.setNext(crunchifyTemp);
		listCount++;
	}

	public void insert(Object data, int pos) {
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
		// No nodes in the list
		if (listCount == 0) {
			crunchifyCurrent.setNext(crunchifyTemp);
		} else if (pos > listCount) { //possibly LC-1
			int tempCount = 0;            
			// go to that position
			while (tempCount < pos) {
				crunchifyCurrent = crunchifyCurrent.getNext();
				tempCount++;
			}
			Node next = crunchifyCurrent.getNext();
			crunchifyCurrent.setNext(crunchifyTemp);
			crunchifyTemp.setNext(next);
		}
	}
	public boolean delete(Object data){
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
		Node next = crunchifyCurrent.getNext();
		if (listCount == 0){
			
		}
		while (crunchifyCurrent.getNext() != null) {
			crunchifyCurrent = crunchifyCurrent.getNext();
			if (next.getValue().equals(data)){
				
				return true;
			}
		}
		return false;
	}
}
