package maths;

public class NumberOf1Bits {
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
		System.out.println(hammingWeight(10));
		System.out.println(hammingWeight(1));
		System.out.println(hammingWeight2(3));
		System.out.println(hammingWeight2(5));
	}
	// you need to treat n as an unsigned value
	// Method1
	public static int hammingWeight(int n) {
		int countOne = 0;

		while(n!=0){
			if((n&1)==1) countOne++;
			n>>>=1;
		}
		return countOne;
	}
	// Method2
	public static int hammingWeight2(int n) {
		int countOne = 0;
		while(n!=0){
			n = n & (n-1);
			countOne++;
		}
		return countOne;
	}
}
