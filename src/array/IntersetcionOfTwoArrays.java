package array;

import java.util.Arrays;
import java.util.HashSet;
/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 */

public class IntersetcionOfTwoArrays {
	public static void main(String[] args) {
		int[] a = {1,2,2,1,3};
		int[] b = {2,2,3,2};
		printArray(intersection(a,b));

	}
	public static int[] intersection(int[] nums1, int[] nums2) {
		int N = nums1.length > nums2.length? nums1.length :nums2.length ;
		int[] result = new int[N];  
		int index = 0;

		HashSet<Integer> element = new  HashSet<>();
		HashSet<Integer> intersect = new HashSet<>();

		for(int n1 : nums1){
			element.add(n1);
		}

		for(int n2 : nums2){
			if(element.contains(n2) && !intersect.contains(n2)){
				intersect.add(n2);
				result[index++] = n2;
			}
		}
		return Arrays.copyOfRange(result,0,index);
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
