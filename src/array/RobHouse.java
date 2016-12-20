package array;
/*You are a professional robber planning to rob houses along a street. Each house has a 
 * certain amount of money stashed, the only constraint stopping you from robbing each of 
 * them is that adjacent houses have security system connected and it will automatically 
 * contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, 
 * determine the maximum amount of money you can rob tonight without alerting the police.
 * */

public class RobHouse {
	
	public static void main(String[] args) {
		int[] a = {};
		int[] b = {1};
		int[] c = {1,2};
		int[] d = {1,2,3,4,5,6,1,11};
		int[] e = {3,2,1,4};
		
		System.out.println(rob(a));
		System.out.println(rob(b));
		System.out.println(rob(c));
		System.out.println(rob(d));
		System.out.println(rob(e));
	}
	 public static int rob2(int[] nums) {
		// DP Solution required
		    if(nums.length==0) return 0;
		    if(nums.length==1) return nums[0];

		    //Initialize an arrays to store the money
			int[] money = new int[nums.length];

		    //money[i]=max(num[i]+money[i-2],money[i-1])
		    //Initialization
			money[0] = nums[0];
			money[1] = Math.max(nums[0], nums[1]);

		    //Using Dynamic Programming to mark the max money in loop.
			for(int i=2;i<nums.length;i++){
				money[i] = Math.max(nums[i]+money[i-2], money[i-1]);
			}
			return money[nums.length-1];
		 
	    }
	 
	 public static int rob(int[] nums) {
			// No extra space FASTER
			    int lastMax = 0;
			    int nowMax = 0;
			    int tempMax = nowMax;
			    
			    for(int money : nums){
			    	tempMax = nowMax;
			    	nowMax = Math.max(lastMax + money, tempMax);
			    	lastMax = tempMax;
			    }
			    
			    return nowMax;
		    }
}
