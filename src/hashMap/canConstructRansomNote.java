package hashMap;

import java.util.HashMap;

/*Given an arbitrary ransom note string and another string containing letters 
 * from all the magazines, write a function that will return true if the ransom
 *  note can be constructed from the magazines ; otherwise, it will return false.
 *  Each letter in the magazine string can only be used once in your ransom note.
 *  canConstruct("a", "b") -> false
 *  canConstruct("aa", "ab") -> false
 *  canConstruct("aa", "aab") -> true
 */

public class canConstructRansomNote {
	public static void main(String[] args) {
		System.out.println(canConstruct("a","b"));
		System.out.println(canConstruct("aa","ab"));
		System.out.println(canConstruct("aaa","aa"));
		System.out.println(canConstruct("ab","aab"));
	}


	// Using HashMap
	public static boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length() > magazine.length()) return false;

		HashMap<Character, Integer> lettersAvail = new HashMap<>();
		// make a map from char and their count in magazine
		int count = 0;
		for(char key : magazine.toCharArray()){
			count = lettersAvail.getOrDefault(key,0) +1;
			lettersAvail.put(key, count);
		}

		for(char key : ransomNote.toCharArray()){
			count = lettersAvail.getOrDefault(key,0) - 1;
			if(count<0) return false;
			lettersAvail.put(key, count);
		}
		return true;
	}

	// Using array sized 26 for char count
	//	 public static boolean canConstruct(String ransomNote, String magazine) {
	//	        int[] arr = new int[26];
	//	        for (int i = 0; i < magazine.length(); i++) {
	//	            arr[magazine.charAt(i) - 'a']++;
	//	        }
	//	        for (int i = 0; i < ransomNote.length(); i++) {
	//	            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
	//	                return false;
	//	            }
	//	        }
	//	        return true;
	//	    }
}
