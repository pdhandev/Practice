package strings;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {
	public static void main(String[] args) {
		List<String> tokens = getTokens("[!?.]+|[a-zA-Z]+");
		int numWords = 0;
		int numSentences = 0;
		int numSyllables = 0;
		
		// TODO: Finish this method.  Remember the countSyllables method from 
		// Document.  That will come in handy here.  isWord defined above will also help.
		for(String word: tokens){
			if(isWord(word)){
				numWords++;
			}
			else{
				numSentences++;
			}
		}
		
		String check = tokens.get(tokens.size()-1);
		
		if(!check.equals(".")){
			numSentences++;
		}
		
	System.out.println(numSentences);
}	
	protected static List<String> getTokens(String pattern)
	{
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher("Hi there. What is happeninglastWord");
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	
	private static boolean isWord(String tok)
	{
	    // Note: This is a fast way of checking whether a string is a word
	    // You probably don't want to change it.
		return !(tok.indexOf("!") >=0 || tok.indexOf(".") >=0 || tok.indexOf("?")>=0);
	}

}