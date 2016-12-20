package array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	    int[] original;
	    int[] shuffled;
	    
	    public ShuffleArray(int[] nums) {
	        original = nums;
	        shuffled = Arrays.copyOf(nums,nums.length);
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	        shuffled=Arrays.copyOf(original, original.length);
	        return shuffled;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    public int[] shuffle() {
	        int temp;
			for(int i =0;i<shuffled.length;i++){
				temp = rand(i, shuffled.length);
				swap(shuffled,temp,i);
			}
			return shuffled;
	    }
	    public static int rand(int min, int max){		
			Random rand = new Random();
			int random = min + rand.nextInt(max-min);
			return random;
		}
	    public static void swap(int[] arr, int i , int j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	/**
	 * Your Solution object will be instantiated and called as such:
	 * Solution obj = new Solution(nums);
	 * int[] param_1 = obj.reset();
	 * int[] param_2 = obj.shuffle();
	 */
