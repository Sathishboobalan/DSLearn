package TwoDimensionalArray;

public class TwoDimensionalArray {
	int arr[][] = null;
	
	//contructor
	public void twoDimensionaArray(int rowCount, int colCount) {
		this.arr = new int[rowCount][colCount];
		for(int row = 0; row < arr.length ; row++) {
			for(int col = 0; col < arr[0].length ; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	//Travers the array
	public void arrayTraversal() {
		try {
			for(int row = 0; row < arr.length ; row++) {
				for(int col = 0; col < arr[0].length ; col++) {
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println("Array does not exit !");
		}
		
	}
	
	//insert the value in the array
	public void insertElemetIntoArray(int row,int col,int val) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = val;
				System.out.println("The value "+val+" is inserted into the array of postion arr["+row+","+col+"]");
			}
			else {
				System.out.println("The cell is already occupied by another value");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the array");
		}
	}
	
	//Access the element which is found in the given cell
	public void accessTheArray(int row,int col) {
		try {
			System.out.println("The value which is found in the cell given is"+arr[row][col]);
		}
		catch(Exception e) {
			System.out.println("Invalid index to find the element!");
		}
	}
	
	//search element in the array
	public void searchingElementInTheArray(int value) {
		for(int row = 0 ; row < arr.length ; row++) {
			for(int col = 0 ; col < arr[0].length ; col++) {
				if(arr[row][col] == value) {
					System.out.println("The value found in the position row = " +row+" col = "+col);
					return;
				}
			}
		}
		System.out.println("Element which given is not found in the Array");
	}
	
	//deleting the element which is found in the given cell
	public void deletingElementInArray(int row,int col) {
		try {
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("Successfully deleted");
		}
		catch(Exception e) {
			System.out.println("invalid index to delete the element");
		}
	}
	
	//deleting entire array
	public void deletingEntireArray() {
		arr = null;
		System.out.println("The entire array has been deleted successfully");
	}
}
