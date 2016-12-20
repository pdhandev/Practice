package maths;
/*
 * Determine whether an integer is a palindrome. Do this without extra space.
Consider negative numbers are not Palindromes
 */
public class IntIsPalindromeNoExtraSpace {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(1210));
		System.out.println(isPalindrome(2112112));
	}

	public static boolean isPalindrome(int x) {
		if(x<0 || (x!=0 && x%10==0)) return false;

		int reverseHalf = 0;

		while(reverseHalf< x){
			reverseHalf = reverseHalf*10 + x%10;
			x /= 10;
		}
		return reverseHalf==x || x==reverseHalf/10 ;
	}
}
