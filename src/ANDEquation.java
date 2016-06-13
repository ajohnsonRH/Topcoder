public class ANDEquation {
	public int restoreY(int[] A) {
        int x = A[1];
        int y = A[0];
        
    	//A contains n + 1 elements
        int n = A.length -1;
        if(n < 2) {
        	return -1;
        }
        for (int i = 2; i < n; i++) {
        	x = x & A[i];
        }
        return x = y;
	}
}