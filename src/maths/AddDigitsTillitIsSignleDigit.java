package maths;

public class AddDigitsTillitIsSignleDigit {
	public static void main(String[] args) {
		System.out.println(addDigits(12345));
	}

	// Tricky One
	public static int addDigits(int num) {
		// num				return
		// 0		  		0
		// num%9 == 0		9
		// else				num%9

		return num==0?0:(num%9==0?9:num%9);
	}


	// Naive Approach
	//	public static int addDigits(int num) {
	//        if(num<10){
	//            return num;
	//        }
	//        
	//        int sum = 0;
	//        while(num>9){
	//            sum = 0;
	//            while(num!=0){
	//                sum += num%10;
	//                num /= 10;
	//            }
	//            num = sum;
	//        }
	//    return sum;
	//        
	//    }
}
