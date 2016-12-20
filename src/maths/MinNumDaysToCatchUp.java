package maths;

public class MinNumDaysToCatchUp {
	public static void main(String args[]){
		System.out.println(minNum(3, 4, 2));
	}

	static int minNum(int A, int K, int P) {
		if(K<=A){
			return -1;
		}
		int days = 0;
		days=P/(K-A);
		return days+1;
	}

}
