package array;
/*Given a non-negative number represented as an array of digits, plus one to the number.
The digits are stored such that the most significant digit is at the head of the list.
*/

public class PlusOneArray {

	public static void main(String[] args) {
		int[] a = {3,9};
		printArray(plusOne(a));
	}

	public static int[] plusOne(int[] digits) {
		if(digits.length ==0) return digits;

		int i = digits.length-1;

		while(i>=0){
			digits[i]++;
			if(digits[i]<=9){
				return digits;
			}
			digits[i--]=0;
		}
		// it will only come out of while loop when digits had 999 and all are made 000 
		// So now we have to append 1 and make 1000
		
		int[] array = new int[digits.length+1];
		array[0]=1;

		return array;
	}


	public static void printArray(int[] array){
		System.out.print("[");
		for(int i=0;i<array.length;i++){
			if(i==array.length-1) System.out.print(array[i]);
			else System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}
}
