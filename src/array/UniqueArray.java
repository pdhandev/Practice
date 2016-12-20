package array;
import java.util.Arrays;

public class UniqueArray {
	public static int[] removeDuplicatesNaive(int[] A) {
		if (A.length < 2)
			return A;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
		
		int[] copy = Arrays.copyOf(A, j+1);
		return copy;
	}
	public static void main(String args[]){
		int[] arr = {1,1,1,1,5,4,4};
		int[] a = removeDuplicatesNaive(arr);
		for(int c:a){
		System.out.print(c +" ");
		}
	}
}
