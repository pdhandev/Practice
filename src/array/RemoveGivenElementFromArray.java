package array;
/*Given an array and a value, remove all instances of that value in place and return the 
 * new length. Do not allocate extra space for another array, you must do this in place 
 * with constant memory. The order of elements can be changed. It doesn't matter what you 
 * leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

* Your function should return length = 2, with the first two elements of nums being 2.
*/
public class RemoveGivenElementFromArray {
	
	public static void main(String[] args) {
		int[] a = {1,2,2,1,3};
		int[] b = {2,2,3,2};
		
		printArray(a,removeElement(a,1));
		printArray(b,removeElement(b,2));
		System.out.println();
		int[] a2 = {1,2,2,1,3};
		int[] b2 = {2,2,3,2};
		printArray(a,removeElement2(a2,1));
		printArray(b,removeElement2(b2,2));
	}
	//does not maintain relative order
	public static int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        
        int end = nums.length;
        for(int i =0;i<end;i++){
            while(nums[i]==val && i<end){
                nums[i]=nums[end-1];
                end--;
            }
        }
        return end;
    }
	
	//maintains relative order of elements
	public static int removeElement2(int[] nums, int val) {
        if(nums.length==0) return 0;
        
        int end = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[end++]=nums[i];
            }
        }
        return end;
    }
	public static void printArray(int[] array, int end){
		System.out.print("[");
		for(int i=0;i<end;i++){
			if(i==end-1) System.out.print(array[i]);
			else System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}
}
