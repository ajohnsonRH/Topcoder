import java.math.BigInteger;

public class ABCSequence {
	public static String[] getElements(String first, String second, String[] indices) {
		BigInteger one = BigInteger.valueOf(Integer.parseInt(first));
		BigInteger two = BigInteger.valueOf(Integer.parseInt(second));
		Integer highestFib = 0;
		// find the highest indice
		for (int i = 0; i < indices.length; i++) {
			Integer current = Integer.parseInt(indices[i]);
			if (current.compareTo(highestFib) == 1) { // current > highestsofar
				highestFib = current;
			}
		}
		BigInteger[] fibNums = new BigInteger[highestFib + 1];
		fibNums[0] = one;
		fibNums[1] = two;
		for (Integer x = 2; x < highestFib + 1; x++) {
			fibNums[x] = fibNums[x - 2].subtract(fibNums[x - 1]);
		}
		for(BigInteger b : fibNums) {
			System.out.print(b.toString()+" ");
		}
		String[] answers = new String[indices.length];
		for (int j = 0; j < indices.length; j++) {
			Integer indice = Integer.parseInt(indices[j]);
//			System.out.print(indice + " ");
			answers[j] = fibNums[indice] + "";
		}
		
		System.out.println();
		return answers;
	}

	public static void main(String[] args) {
		// 823, 470, ["3","1","31","0","8","29","57","75","8","77"]
		String[] ind = new String[10];
		ind[0] = "3";
		ind[1] = "1";
		ind[2] = "31";
		ind[3] = "0";
		ind[4] = "8";
		ind[5] = "29";
		ind[6] = "57";
		ind[7] = "75";
		ind[8] = "8";
		ind[9] = "77";
		String[] anwr = getElements("823", "470", ind);
		for (String s : anwr) {
			System.out.print(s + " ");
		}
	}
}