public class Bullets {
    public int match (String[] guns, String bullet) {
        int gunNum = 0; 
        for(String gun : guns) {
            if(gun.equalsIgnoreCase(bullet)) {
                return gunNum;
            }
            gunNum++;
        }
    	return -1;
    }
}