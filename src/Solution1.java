import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Solution1 {

   static boolean isAnagram(String A, String B) {
      //Complete the function
        if(A.length() != B.length()) {
            return false;
        }
//       Map<Character,Integer> aMap = countLetters(A);
//       Map<String,Integer> bMap = countLetters(B);
//       for(String letter : aMap.keySet()) {
//            if(aMap.get(letter) != bMap.get(letter)) {
//                return false;
//            }
//       }
//       
       return true;
   }
    static Map<String, Integer> countLetters(String letters) {
        Map<String, Integer> letterMap = new HashMap<String, Integer>();
        for (int i = 0; i < letters.length(); i++) { 
        	Integer mapValue = letterMap.get(letters.charAt(i));
            if(mapValue != null) {
            	letterMap.put(letters.charAt(i).toString, ((Integer) mapValue + 1));
            } else {
            	letterMap.put(letters.charAt(i),  ((Integer) 1));
            }
        }
        return letterMap;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        sc.nextInt()
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
