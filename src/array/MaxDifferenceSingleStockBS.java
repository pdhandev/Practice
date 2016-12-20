package array;

public class MaxDifferenceSingleStockBS {
	public static void main(String args[]){
		int[] a = {1,2,3,100,1,99};
		System.out.println(maxDifference(a));
	}
	
	static int maxDifference(int[] a) {
		int n = a.length;
		int maxDiff =-1;
		int min = a[0];
		for(int i =1; i<n;i++){
			if(a[i]-min > maxDiff){
				maxDiff=a[i]-min;
			}
			if(a[i]<min){
				min = a[i];
			}    
		}
		return maxDiff;
	}

}
