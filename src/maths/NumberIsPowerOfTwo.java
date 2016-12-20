package maths;

public class NumberIsPowerOfTwo {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(128));
		System.out.println(isPowerOfTwo(28));
	}

	public static boolean isPowerOfTwo(int n) {
		// n should be positive and it should have only one 1 in binary form 100(4) & 011(3) =0
		return (n>0 && (n&(n-1))==0);
	}
}
