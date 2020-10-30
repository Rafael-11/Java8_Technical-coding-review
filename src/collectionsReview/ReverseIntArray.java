package collectionsReview;


public class ReverseIntArray {

	public static void main(String[] args) {

		/**
		 * Reverse oder of an array of unordered integers
		 */
		/*
		 * 
		 * int [] arr={5,2,8,1,9};
		 * 
		 * Expected: 9,1,8,2,5
		 * 
		 */
		int[] arr = { 5, 2, 8, 1, 9 };
		for (int i = arr.length - 1; i >= 0; i--) {
		     System.out.println(arr[i]+" ");
		}
       
	}

}
