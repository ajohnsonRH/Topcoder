import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        //read the number of jump games
        int numGames = reader.nextInt();
        //for each jump game : 
        for (int i = 0; i < numGames; i++) {
            int n = reader.nextInt();
            int m = reader.nextInt();
            int[] newArray = new int[n];
            for (int j = 0; j < n; j++) {
                newArray[j] = reader.nextInt();
            }
            determineWin(newArray, m); //TODO find a better way to do this so that the reader can close
        }
        //read the jump lengths
        reader.close();
    }



	public static void determineWin(int[] array, int jump) {
		boolean gotOut = false;
		int pos = 0;
		// x + 1, x - 1 (unless zero), x + m (this can go over length of array)
		while (!gotOut) {
			if (pos >= array.length - 1) {
				gotOut = true;
				break;
			} else if (array[pos] == 1) { // try forwards
				gotOut = false;
				if (pos > 0) { // try backwards
					if (array[pos--] == 0) {
						pos--;
					}
				} else if ((pos - 1) + jump <= array.length - 1) {
					// try a jump
					pos = (pos - 1) + jump;
				} else {
					break;
				}
			} else {
				pos++;
			}
		}
		System.out.println(pos);
		if (gotOut) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}