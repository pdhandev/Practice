package hashMap;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(uniqueChar("Hello"));
		System.out.println(uniqueChar("Priya"));
		System.out.println(uniqueChar("Vivek"));
		System.out.println(uniqueChar("Navya"));
	}
	
	public static boolean uniqueChar (String str){
		for(int i =0; i<str.length();i++){
			for(int j =i+1; j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					return false;
				}
			}
	}
		return true;
}
}