import java.util.Arrays;

public class ASeries {
	public static int longest(int[] values) {
		Arrays.sort(values);
		int highCount = 1;
		int diff = 0;
		for (int i = 0; i < values.length -1 ; i++) {
			diff = values[i + 1] - values[i];
			int count = 1;
			// one half of the sequence
			for (int j = i; j < values.length -1; j++) {
				int newdiff = values[j+1] - values[j];
				if (newdiff == diff) {
					count++;
				}
			}
			// start over from the beginning
			for (int j = 0; j < i; j++) {
				int newdiff = values[j + 1] - values[j];
				if (newdiff == diff) {
					count++;
				}
			}
			if (count > highCount) {
				highCount = count;
			}
		}
		return highCount;
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
		System.out.println(longest(values));

	}
}