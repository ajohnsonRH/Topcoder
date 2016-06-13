public class ATaleOfThreeCities {
	public double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy) {
		double shortestABDist = 9999.9, shortestACDist = 9999.9, shortestBCDist = 9999.9;
		for (int i = 0; i < ax.length; i++) {
			for (int j = 0; j < bx.length; j++) {
				double computedDist = computeDistance(ax[i], bx[j], ay[i], by[j]);
				if (computedDist < shortestABDist) {
					shortestABDist = computedDist;
				}
			}
			for (int k = 0; k < cx.length; k++) {
				double computedDist = computeDistance(ax[i], cx[k], ay[i], cy[k]);
				if (computedDist < shortestACDist) {
					shortestACDist = computedDist;
				}
			}
		}
		for (int l = 0; l < bx.length; l++) {
			for (int p = 0; p < bx.length; p++) {
				double computedDist = computeDistance(cx[p], bx[l], cy[p], by[l]);
				if (computedDist < shortestBCDist) {
					shortestBCDist = computedDist;
				}
			}
		}
		return determineShortestRoutes(shortestABDist, shortestACDist, shortestBCDist);
	}

	private double determineShortestRoutes(double shortestABDist, double shortestACDist, double shortestBCDist) {
		if (shortestABDist <= shortestACDist) {
			if (shortestACDist <= shortestBCDist) {
				return shortestABDist + shortestACDist;
			} else {
				return shortestABDist + shortestBCDist;
			}
		} else {
			if (shortestABDist <= shortestBCDist) {
				return shortestACDist + shortestABDist;
			} else {
				return shortestACDist + shortestBCDist;
			}
		}
	}

	public double computeDistance(int x1, int x2, int y1, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}