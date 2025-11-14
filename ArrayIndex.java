package demo;

public class ArrayIndex extends Exception {
	public static void main(String[] args) {
		
		try {
			// Creating an array with 4 elements
			int[] arr = {3, 4, 6, 6};

			// Loop runs from index 0 to 6 (but array has only index 0 to 3)
			for (int i = 0; i <= 6; i++) {
				// Printing the element at each index
				System.out.println("Elements at index " + i + ": " + arr[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// This block runs when we try to access index that doesn't exist in array
			System.out.println("Error: Array index out of bounds.");
		}
	}
}
