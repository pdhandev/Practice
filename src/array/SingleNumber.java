package array;

// All numbers occur twice except one, find out that Single one
public class SingleNumber {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,4,5,5,3};
		System.out.println(singleNumber(array));

	}
	public static int singleNumber(int[] nums) {
        int singleOne = 0;
        for(int digit : nums){
            singleOne ^= digit;
        }
        return singleOne;
    }

}
