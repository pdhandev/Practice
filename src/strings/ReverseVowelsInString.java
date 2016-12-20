package strings;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsInString {

	public static void main(String[] args) {
		System.out.println(reverseVowels("Priya"));
	}

	public static String reverseVowels(String s) {
		if((s == null)|| s.equals("")){
			return s;
		}
		char[] ch = s.toCharArray();
		int n = s.length();
		char temp = ' ';

		int left = 0;
		int right = n-1;

		Set<Character> set =  new HashSet<Character>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');

		while(true){

			while((!set.contains(ch[left])) && (left< right)){
				left++;
			}

			while((!set.contains(ch[right])) && (right> left)){
				right--;
			}
			if(left>=right){
				break;
			}
			temp = ch[left];
			ch[left]=ch[right];
			ch[right] = temp;

			left++;
			right--;

		}

		String revString = new String(ch);
		return revString;
	}

}
