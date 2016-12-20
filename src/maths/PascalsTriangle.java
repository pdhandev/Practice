package maths;

import java.util.ArrayList;

public class PascalsTriangle {
	 public ArrayList<ArrayList<Integer>> generate(int numRows) {
	        
		 ArrayList<ArrayList<Integer>> Ptriangle = new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> row, pre =  null;
	        
	        for(int i =0; i<numRows;i++){
	            row = new ArrayList<Integer>();
	            for(int j = 0; j<=i;j++){
	                if(j==0 || j==i) {
	                    row.add(1);
	                }
	                else{
	                    row.add(pre.get(j-1) + pre.get(j));
	                }
	            }
	            
	            pre = row;
	            Ptriangle.add(row);
	        }
	        return Ptriangle;
	    }
}
