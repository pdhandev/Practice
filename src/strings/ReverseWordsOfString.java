package strings;

public class ReverseWordsOfString {

	// input : Hello my name is Priya , Hello to this world
	// output: olleH ym eman si ayirP , olleH ot siht dlrow
	public static void main(String[] args){
		System.out.println(stringWordReversal("Hello my name is Priya"));
		System.out.println(stringWordReversal("Hello to this world"));
	}
	
	public static String stringWordReversal(String s){
		StringBuilder revresedStr = new StringBuilder();
		
		for(String str : s.split(" ")){
			revresedStr.append(reverse(str)).append(" ");
		}
		return new String(revresedStr);
	}

	private static String reverse(String str) {
		int n = str.length();
		
		char[] charStr = str.toCharArray();
		char charTemp = ' ';
		for(int i =0; i<n/2;i++){
			charTemp = charStr[i];
			charStr[i] = charStr[n-1-i];
			charStr[n-1-i] = charTemp;
		}
		return new String(charStr);
	}
	
	
}
