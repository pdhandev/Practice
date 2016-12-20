package array;

public class StockMultipleBS {
	public static void main(String args[]){
		int[] a = {1,2,3,100,1};
		maxProfit(a);
	}
	
	
	public static void maxProfit(int[] arr) {
		int tempMax =0;
		long Profit = 0;

		for(int i = arr.length-1; i>=0;i--){
			if(arr[i]>=tempMax){
				tempMax=arr[i];
			}
			Profit += tempMax - arr[i];
		}
	System.out.println(Profit);
	}
}
