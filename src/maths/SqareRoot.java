package maths;

public class SqareRoot {
//Function for finding floorsqrt
	public static int floorSqrt(int number){
		if(number==0 || number ==1){
			return number;
		}
		
		int start=1, end=number, answer = 0;
		
		while(start<=end){
			int mid =(start+end)/2;
			
			if(mid*mid == number){
				return mid;
			}
			
			if (mid*mid < number){
				start = mid+1;
				answer = mid;
			}
			else{
				end = mid-1;
			}
		}
		return answer;
	}
	
	public static int floorsqrt(int number){
		if(number==0 || number ==1){
			return number;
		}
		int i =1, result=1;
		
	while(i*i<number){
		i++;
		result=i*i;
		if(result==number){
			return i;
		}
	}
		
		return i-1;
	}
	
	public static void main(String[] args) {
		System.out.println(floorSqrt(9));
		System.out.println(floorSqrt(8));
		System.out.println(floorSqrt(7));
		
		System.out.println(floorsqrt(9));
		System.out.println(floorsqrt(8));
		System.out.println(floorsqrt(7));
		
		
	}
}
