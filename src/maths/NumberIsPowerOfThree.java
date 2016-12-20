package maths;

public class NumberIsPowerOfThree {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(0));
		System.out.println(isPowerOfThree(1));
		System.out.println(isPowerOfThree(27));
		System.out.println(isPowerOfThree(21));
	}


	// Without loop
	//	public static boolean isPowerOfThree(int n) {
	//	int Max3PowerInt = 1162261467; // 3^19 the last int which is powerOfThree
	//        if (n <= 0 || n > Max3PowerInt) return false;
	//        return Max3PowerInt % n == 0;
	//    }

	// Using loop
	public static boolean isPowerOfThree(int n) {
		if(n<=0) return false;
		if(n==1) return true;

		while(n%3==0){
			n/=3;
			if(n==1){
				return true;
			}
		}

		return false;
	}
}
