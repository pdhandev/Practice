package array;

import java.util.ArrayList;
import java.util.Arrays;
/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that
you cannot load all elements into the memory at once?
 */

public class IntersectionOfTwoArraysVersion2 {
	public static void main(String[] args) {
		int[] a = {1,2,2,1,3};
		int[] b = {2,2,3,2};
		printArray(intersect(a,b));

	}
	public static int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0; 
		while(i< nums1.length && j<nums2.length){
			if(nums1[i]<nums2[j]){
				i++;
			}
			else if(nums1[i] == nums2[j]){
				res.add(nums1[i]);
				i++;
				j++;
			}
			else{
				j++;
			}
		}
		int[] result = new int[res.size()];
		for(int k = 0; k<res.size();k++){
			result[k] = res.get(k);
		}
		return result;
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
