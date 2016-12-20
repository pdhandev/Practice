package array;

import java.util.HashMap;
import java.util.Map;

public class StockSingleBuyMultipleSell {

	public static void stockProfit(int[] arr){
		
		/*
		int Profit = 0;    
        for (int i=0; i< prices.length-1; i++) {
        if (prices[i+1]>prices[i]) Profit += prices[i+1]-prices[i];
        }
        return Profit;
		 */
		
		int bd = 0;
		int sd = 1;
		int Profit = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		while(sd<arr.length){
			if(arr[sd]>arr[sd-1]){
				map.put(bd,sd);
				sd++;
			}
			else{
				bd=sd;
				sd++;
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			// System.out.println(arr[entry.getValue()] + " " + arr[entry.getKey()]);
			Profit += arr[entry.getValue()] - arr[entry.getKey()];
		}

		System.out.println(Profit);
	}
}
