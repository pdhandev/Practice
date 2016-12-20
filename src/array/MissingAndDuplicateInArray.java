package array;
// 1 to N in array of size N : Example [3,2,2,1] Missing 4, Dup 2
public class MissingAndDuplicateInArray {

	public static void main(String[] args){
		int arr[] = {7, 3, 4, 5, 5, 6, 2};
		printTwoElements(arr);	
	}

	static void printTwoElements(int arr[])
	{
		int size = arr.length;

		System.out.print("The repeating element is ");

		for(int i = 0; i < size; i++)
		{
			if(arr[Math.abs(arr[i])-1] > 0)
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}

		System.out.print("and the missing element is ");
		for(int i=0; i<size; i++)
		{
			if(arr[i]>0)
				System.out.println(i+1);
		}
	}
}
