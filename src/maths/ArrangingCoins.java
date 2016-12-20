package maths;
/*You have a total of n coins that you want to form in a staircase shape, where every 
 * k-th row must have exactly k coins.
 * Given n, find the total number of full staircase rows that can be formed.
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:
n = 5
The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.

If x is the answer, then n coins do fill x rows but don't fill x+1 rows. So we have 
x(x+1)/2 <= n < (x+1)((x+1)+1)/2. Which, using the other formula, turns into 
x <= (sqrt(8n+1) - 1) / 2 < x+1. So we indeed get the right answer by rounding down 
(sqrt(8n+1) - 1) / 2.
 */

public class ArrangingCoins {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(0));
		System.out.println(arrangeCoins(1));
		System.out.println(arrangeCoins(5));
		System.out.println(arrangeCoins(3));
	}

	public static int arrangeCoins(int n) {
		return (int) ((Math.sqrt(1 + 8* (long)n) - 1) / 2);
	}

	public static int arrangeCoins2(int n) {
		//Binary Search
		//convert int to long to prevent integer overflow
		long nLong = (long)n;

		long start = 0;
		long end = nLong;

		long mid = 0;

		while (start <= end){
			mid = start + (end - start) / 2;

			if (mid * (mid + 1) <= 2 * nLong){
				start = mid + 1;
			}else{
				end = mid - 1;
			}
		}

		return (int)(start - 1);
	}
}
