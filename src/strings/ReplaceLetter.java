package strings;

public class ReplaceLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("Hi Priya", 'i', 'p'));

	}



	public static String replace(String word, char gone, char here){	
		char[] cArray = word.toCharArray();
		int i =0;
		for (char c : cArray){
			if (c == gone) cArray[i] = here;
			i++;
		}
		return new String(cArray);
	}

}
