package strings;

public class StringReversalUsingArray {
	public static void main(String[] args) {
		System.out.println(reverseString("Priya"));
	}

	public static String reverseString(String s) {
		if(s==null || s.equals("")){
			return s;
		}

		int n = s.length();
		char temp = 0;
		char[] ch = s.toCharArray();
		for(int i=0 ; i<n/2 ; i++){
			temp = ch[i];
			ch[i] = ch[n-1-i];
			ch[n-1-i] = temp;
		}
		String revString = new String(ch);
		return revString;

	}
}
