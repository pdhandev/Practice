package maths;



public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(function(100));
		System.out.println(fibonacci(6));
	}


	// Fibonacci Recursion
	public static int fibonacci(int n){
		if(n==0 || n==1) return n;
		else return fibonacci(n-2) + fibonacci(n-1);
	}
	
	// Iteration
	

	//Confusing question returns 1
	public static long function(int n){
		if(n<=0) return 1;
		else return function(n-1);
	}
}
