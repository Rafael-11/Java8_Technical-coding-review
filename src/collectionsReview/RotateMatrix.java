package collectionsReview;

import java.util.Arrays;

public class RotateMatrix {
	public static void main(String[] args) {
		/**
		 * Rotate an (n*n) matrix 90 degree right in place
		 * 
		 * 
		 */

		/*
		 * int[][] nums={{1,2},{3,4}};
		 * 
		 * int[][] temp=new
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		int[][] arr= {{1,2},{3,4}};
		
		System.out.println(turnMatrix(arr).toString());

	}
	public static int[][] turnMatrix(int[][] matrix) {
	    for (int[] ints : matrix) {
	        if (matrix.length != ints.length) {
	            return matrix;
	        }
	    }
	    int length;
	    if (matrix.length % 2 == 0) {
	        length = matrix.length / 2;
	    } else {
	        length = (matrix.length - 1) / 2;
	    }
	    for (int swapArr = 0; swapArr < length; swapArr++) {
	        for (int cell = 0; cell < matrix[swapArr].length; cell++) {
	            int temp = matrix[swapArr][cell] + matrix[(matrix.length - 1) - swapArr][cell];
	            matrix[swapArr][cell] = temp - matrix[swapArr][cell];
	            matrix[(matrix.length - 1) - swapArr][cell] = temp - matrix[(matrix.length - 1) - swapArr][cell];
	        }
	    }
	    int nextSwapArrInd = 1;
	    int nextSwapCellInd = 0;
	    for (int swappingArrInd = 0; swappingArrInd < matrix.length; swappingArrInd++) {
	        for (int swapCellInd = swappingArrInd + 1; swapCellInd < matrix[swappingArrInd].length; swapCellInd++) {
	            int swappingCellTempValue = matrix[swappingArrInd][swapCellInd] + matrix[nextSwapArrInd][nextSwapCellInd];
	            matrix[swappingArrInd][swapCellInd] = swappingCellTempValue - matrix[swappingArrInd][swapCellInd];
	            matrix[nextSwapArrInd][nextSwapCellInd] = swappingCellTempValue - matrix[nextSwapArrInd][nextSwapCellInd];
	            nextSwapArrInd++;
	        }
	        nextSwapArrInd = swappingArrInd + 2;
	        nextSwapCellInd++;
	    }
	    return matrix;
	}
	
}
