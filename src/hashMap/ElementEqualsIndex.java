package hashMap;

public class ElementEqualsIndex {
	public static void main(String[] args) {
		/* X[i]==i in a sorted array  with binary search */
		int arr[] = {-3, -1, 0, 3, 5, 7 , 1};
		System.out.println(indexEqualsElement(arr));
		//for duplicate version go to link below
		//http://stackoverflow.com/questions/30146773/search-a-sorted-integer-array-for-an-element-equal-to-its-index-where-a-may-hav
	}
	
	public static int indexEqualsElement(int[] X){
	    int low  = 0;
	    int high = X.length - 1;
	    int mid;
	    while(low <= high) {
	            mid = (low + high) / 2;

	            // change X[mid] to X[mid] - mid
	            if(X[mid] - mid == 0){
	            	  return mid;
	            }
	            // change here to right half
	            else if(X[mid] - mid < 0){
	                    low = mid + 1;
	            }
	            else{
	                    high = mid - 1;
	            }
	    }
	    return -1; // no such index exists...return an invalid index.
	}

}
