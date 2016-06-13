public class ABBA {

	public String canObtain(String init, String target) {
		int numMoves = target.length() - init.length();
		Node head = createTree(init, numMoves);
		String[] results = traverseLeaves(head).split(" ");
		for (String s : results) {
			if (s.equalsIgnoreCase(target)) {
				return "Possible";
			}
		}
		return "Impossible";
	}

	// returns the head of a the answer tree
	private Node createTree(String init, int moves) {
		Node head = new Node(init);
		head = setChildren(head, moves);
		return head;
	}

	private Node setChildren(Node current, int moves) {
		if (moves == 0) { // base case
			return current;
		}
		// set left as + A
		Node left = setChildren(new Node(current.value.concat("A")), moves--);
		current.setLeft(left);
		// set right as reverse + B
		Node right = setChildren(new Node(reverse(current.value).concat("B")), moves--);
		current.setRight(right);
		return current;
	}

	public static String reverse(String s) {
		String newString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			newString += s.charAt(i);
		}
		return newString;
	}

	// finds all of the ending Node words that can be made in x moves
	private String traverseLeaves(Node head) {
		if (head.left == null && head.right == null) {
			return head.value + " ";
		} else {
			return traverseLeaves(head.left) + traverseLeaves(head.right);
		}
	}

	public class Node {
		public String value;
		public Node left;
		public Node right;

		public Node(String value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public void setLeft(Node left) {
			this.left = left;
		}
	}

	public static void main(String[] args) {
//		System.out.println(reverse("hello"));
	
		System.out.println("hello".substring(4,5));
		
		
//		canObtain("AB","ABBA");
	}
}