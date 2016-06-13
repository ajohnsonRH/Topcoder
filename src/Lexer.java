public class Lexer {

	public static void main(String[] args) {
		String[] tokens = { "ab", "A", "aba" };
		String input = "ababbbaAab";
		System.out.print("Consumed: ");
		for (String s : tokenize(tokens, input)) {
			if (s != null) {
				System.out.print(s + " ");
			}
		}
	}

	public static String[] tokenize(String[] tokens, String input) {
		String[] consumed = new String[input.length()]; // don't like this
		String remaining = input;
		int count = 0;
		while (remaining != "") {
			String currentToken = "";
			for (int i = 0; i < tokens.length; i++) {
				int len = tokens[i].length();
				if (remaining.length() >= len && remaining.substring(0, len).equalsIgnoreCase(tokens[i])) {
					if (tokens[i].length() > currentToken.length()) {
						// find the longest token
						currentToken = tokens[i];
					}
				}
			}
			if (currentToken != "") {
				consumed[count] = currentToken;
				count++;
				if (remaining.length() > currentToken.length()) {
					remaining = remaining.substring(currentToken.length());
				} else {
					remaining = "";
				}
			} else { // get rid of one character
				remaining = remaining.substring(1);
			}
		}

		return consumed;
	}
}