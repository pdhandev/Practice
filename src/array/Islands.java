package array;
public class Islands {

	//Here the number of islands are 3
	public static int numberOfIslands(int[][] matrix){

		int islandCount=0;
		for(int row=0; row< matrix.length; row++){
			for(int column=0 ;column< matrix[row].length ; column++){

				if(matrix[row][column] == 1){
					//call function to perform required things like count number of 1's or
					//count the number of islands
					nullifyVisited(matrix,row,column);
					islandCount++;
				}
			}
		}
		return islandCount;
	}


	public static void nullifyVisited(int[][] matrix, int row, int column){

		if(row<0 || column<0 || column>=matrix.length || row>= matrix.length){
			return;
		}

		if(matrix[row][column]==0){
			return;
		}

		matrix[row][column]=0;
		for(int r=row-1; r<=row+1; r++){
			for(int c= column-1; c<=column+1; c++){
				// don't visit same cell again
				if(r!=row || c!=column){
					nullifyVisited(matrix, r , c);
				}
			}
		}

	}

	// BiggestIsland here is with 4 ones
	public static int biggestIslandsNumber(int[][] matrix){
		int oneCount=0;
		int maxoneCount=0;
		for(int row=0; row< matrix.length; row++){
			for(int column=0 ;column< matrix[row].length ; column++){

				if(matrix[row][column] == 1){
					//call function to perform required things like count number of 1's or
					//count the number of islands
					oneCount = trackVisited(matrix,row,column);
					maxoneCount= Math.max(oneCount,maxoneCount);
				}
			}
		}
		return maxoneCount;
	}

	public static int trackVisited(int[][] matrix, int row, int column){
		if(row<0 || column<0 || column>=matrix.length || row>= matrix.length){
			return 0;
		}

		if(matrix[row][column]==0){
			return 0;
		}
		
		matrix[row][column]=0;
		int oneCount =1;
		for(int r=row-1; r<=row+1; r++){
			for(int c= column-1; c<=column+1; c++){
				// don't visit same cell again
				if(r!=row || c!=column){
					oneCount+=trackVisited(matrix, r , c);
				}
			}
		}

		return oneCount;
	}
	public static void printMatrix(int[][] matrix){
		for(int row=0; row< matrix.length; row++){
			for(int column=0 ;column< matrix[row].length ; column++){
				System.out.print(matrix[row][column]+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		// 1 1 1 0 0
		// 1 0 0 0 0
		// 0 0 1 1 0
		// 1 0 1 0 0
		// 1 0 0 1 0

		int[][] islandMatrix = {{1,1,1,0,0},{1,1,0,0,0},{1,0,0,0,0},{1,0,1,0,0},{1,0,0,1,0}};
		printMatrix(islandMatrix);
		//System.out.println(numberOfIslands(islandMatrix));
		System.out.println(biggestIslandsNumber(islandMatrix));
		printMatrix(islandMatrix);
		System.out.println();
		int[][] bool = islandMatrix.clone(); //islandMatrix
		printMatrix(bool);

	}

}
