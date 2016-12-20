package array;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
//		System.out.println(rand(2,6));
		int[] array = {1,2,3};
		int i =15;
		while(i>=0){
		printArray(shuffle(array));
		System.out.println();
		i--;
		}
	}

	public static int[] shuffle(int[] arr){
		int temp;
		for(int i =0;i<arr.length;i++){
			temp = rand(i, arr.length);
			swap(arr,temp,i);
		}
		return arr;
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
	public static void printArray(int[] array){
		System.out.print("[");
		for(int i=0;i<array.length;i++){
			if(i==array.length-1) System.out.print(array[i]);
			else System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}

}
