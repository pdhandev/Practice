package hashMap;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args){
		int[] arr = {3,4,5,4,7,1};
		twoSum(arr, 8);

		//		int[] a =twoSum(arr, 8);
		//		for(int b : a){
		//			System.out.println(b);
		//	}
	}

	public static void twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				System.out.println(index + " " + i);
				//				result[0] = index ;
				//				result[1] = i;
				//				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}

		//		return result;
	}

}
