package hashMap;

import java.util.HashMap;
/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
* What if the inputs contain unicode characters? How would you adapt your solution to such case?
* Answer: I have used a hash table as it is a more generic solution and could adapt to any range
* of characters.
*/

public class IsAnagram {
	
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram","nagaram"));
		System.out.println(isAnagram("ab","aab"));
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;

		HashMap<Character, Integer> lettersAvail = new HashMap<>();

		// make a map from char and their count in magazine
		int count = 0;
		for(char key : t.toCharArray()){
			count = lettersAvail.getOrDefault(key,0) +1;
			lettersAvail.put(key, count);
		}

		for(char key : s.toCharArray()){
			count = lettersAvail.getOrDefault(key,0) - 1;
			if(count<0) return false;
			lettersAvail.put(key, count);
		}
		return true;
	}
}
