import java.util.Scanner;
import java.util.regex.*;

public class Solution2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		boolean isValid = true;
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			try {
				Pattern p = Pattern.compile(pattern);
			} catch (PatternSyntaxException e) {
				isValid = false;
			}
			testCases--;
			if (isValid) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}

	}
}
