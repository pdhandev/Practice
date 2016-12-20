package maths;

public class NumberIsPowerOfFour {
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(64));
		System.out.println(isPowerOfFour(128));
	}

	public static boolean isPowerOfFour(int n) {
		// n should be positive and it should have only one 1 in binary form 100(4) & 011(3) =0
		// and the 1 should be in odd place for that hex representation 0x55555555
		return (n>0 && (n&(n-1))==0 && (n& 0x55555555) != 0);
	}
}
