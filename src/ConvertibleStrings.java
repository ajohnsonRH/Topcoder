public class ConvertibleStrings {
	public static int leastRemovals(String A, String B) {
		String aTemp = A;
		int removals = 0;
		for (int i = 0; i < B.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				int oldScore = score(aTemp, B);
				// choice one - do a replace
				aTemp = aTemp.replace(A.charAt(i), B.charAt(i));
				//System.out.println("A: " + aTemp + " B:" + B);
				int newScore = score(aTemp, B);
				if (newScore <= oldScore && !aTemp.equals(B)) {
					// choice 2 - do a removal
					if (i > 1) {
						aTemp = aTemp.substring(0, i-1) + aTemp.substring(i, B.length());
						B = B.substring(0, i-1) + B.substring(i, B.length());
					} else {
						aTemp = aTemp.substring(i-1, B.length());
						B = B.substring(i-1, B.length());
					}
					System.out.println("A: " + aTemp + " B:" + B);
					removals++;
				}
			}
		}
		if (aTemp.equals(B)) {
			System.out.println("success");
		}
		System.out.println("A: " + aTemp + " B:" + B);
		return removals;
	}

	public static void main(String[] args) {
		System.out.println("" + leastRemovals("DD", "FF"));
		System.out.println("" + leastRemovals("AAAA", "ABCD"));
		System.out.println("" + leastRemovals("AAIAIA", "BCDBEE"));
	}

	private static int score(String a, String b) {
		int score = 0;
		for (int i = 0; i < b.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				score++;
			}
		}
		return score;
	}

}