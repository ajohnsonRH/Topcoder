
public class LongestSub {
	public static int[] longestSubSeq(int[] seq) {
		int[] longSub = new int[seq.length]; // longest could be the entire
												// sequence
		for (int i = 0; i < seq.length; i++) {
			int num1 = seq[i];
			int count = 0;
//			System.out.println(seq);
			printSub(seq);
			int[] sub = new int[seq.length];
			for (int j = i; j < seq.length; j++) { // right side of array
				if (seq[j] > num1) {
					sub[count] = num1;
					num1 = seq[j];
					count++;
				}
			}
			for (int k = 0; k < i; k++) { // left side of array
				if (seq[k] > num1) {
					sub[count] = num1;
					num1 = seq[k];
					count++;
				}
			}
			if (count + 1 > longSub.length) {
				for (int n = 0; n < sub.length; n++) {
					longSub[n] = sub[n];
				}
				System.out.println("--");
				printSub(longSub);
				System.out.println("--");
			}

		}
		return longSub;
	}

	public static void main(String[] args) {
		int[] values = new int[7];
		values[0] = 1;
		values[1] = 2;
		values[2] = 2;
		values[3] = 4;
		values[4] = 5;
		values[5] = 3;
		values[6] = 2;
		printSub(longestSubSeq(values));
		
	}
	public static void printSub (int[] vals){
		System.out.println();
		for (int i = 0; i < vals.length; i++) {
			System.out.print(" " + vals[i]);
		}
		System.out.println();
	}
}
