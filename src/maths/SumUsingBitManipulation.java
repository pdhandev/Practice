package maths;

public class SumUsingBitManipulation {

	public static void main(String[] args) {
		System.out.println(getSum(10,20));
		System.out.println(Integer.toBinaryString(243));
	}

	// Recursive Solution
	public static int getSum(int a, int b) {
		if(b==0){
			return a;
		}
		int sum = a^b;
		int carry = (a&b) <<1;
		return getSum(sum,carry);
	}

	// Iterative Solution
	//	    public int getSum(int a, int b) {
	//	    if(a==0) return b;
	//	    if(b==0) return a;
	//	    
	//	    while(b!=0){
	//	        int carry = a&b;
	//	        a = a^b;
	//	        b = carry <<1;
	//	    }
	//	    
	//	    return a;
	//	    }

}
