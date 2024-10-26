package twodimensionarray;

import java.security.PublicKey;
import java.util.InputMismatchException;
import java.util.Iterator;

public class TwoDimensionArray {
	int[][] arr;
// creation
	public TwoDimensionArray(int rowSize, int colSize) {// ------>O(n^2)
		arr = new int[rowSize][colSize];
		for (int row = 0; row < arr.length; row++) {// --->O(n)
			for (int col = 0; col < arr[row].length; col++) {// --->O(n)
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	// insertion
	public void insertion(int row, int col, int value) {// ----->O(1)
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("The value " + value + " is inserted");
			} else {
				System.out.println("The location is already filled");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invlid Row & column");
		}
	}
//	Trverse
	public void traverse() {// --->O(n^2)
//		for (int row = 0; row < arr.length; row++) {// --->O(n)
//			for (int col = 0; col < arr[row].length; col++) {// --->O(n)
//				if (arr[row][col] != Integer.MIN_VALUE)
//					System.out.print(arr[row][col] + " ");
			//}
			System.out.println();
		}
	
	public void searchByIndex(int row, int col) {// ---->O(1)
		try {
			System.out.println("The value is present in the: " + row + " & " + col + " is: " + arr[row][col]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invlid Row & column");
		}
	}
	public void searchByValue(int value) {// O(n^2)
		try {
			for (int row = 0; row < arr.length; row++) {// --->O(n)
				for (int col = 0; col < arr[row].length; col++) {// --->O(n)
					if (arr[row][col] == value) {
						System.out.println("The value is present in the index of " + row + "," + col);
						return;
					}
				}
			}
			System.out.println("The value is not present");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}

	// Deletion
	public void deleteByIndex(int row, int col) {// ---->O(1)
		try {
			System.out.print("The value is present in the: " + row + " & " + col + " is: " + arr[row][col]);
			System.out.println(" is deleted");
			arr[row][col] = -Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invlid Row & column");
		}
	}

	public void deleteByValue(int value) {// O(n^2)
		try {
			for (int row = 0; row < arr.length; row++) {// --->O(n)
				for (int col = 0; col < arr[row].length; col++) {// --->O(n)
					if (arr[row][col] == value) {
						System.out.println("The value is present in the index of " + row + "," + col + " is deleted");
						arr[row][col] = Integer.MIN_VALUE;
						return;
					}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}

	public static void main(String[] args) {
		TwoDimensionArray tda = new TwoDimensionArray(3, 3);
		tda.insertion(0, 0, 10);
		tda.insertion(0, 1, 20);
		tda.insertion(0, 2, 30);
		tda.insertion(1, 0, 40);
		tda.insertion(1, 1, 50);
		tda.insertion(1, 2, 60);
		tda.insertion(2, 0, 70);
		tda.insertion(2, 1, 80);
		tda.insertion(2, 2, 90);
		System.out.println("*****************************");
		tda.traverse();
		System.out.println("*****************************");
		tda.searchByIndex(2, 0);
		System.out.println("*****************************");
		tda.searchByValue(30);
		System.out.println("*****************************");
		tda.deleteByIndex(1, 2);
		tda.traverse();
		tda.deleteByValue(70);
		tda.traverse();
	}
}
