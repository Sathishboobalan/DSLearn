package SingleDimensionArray;

public class SingleDimensionArray {
	int arr[] = null;
	
	//constructor
	public void singleDimensionArray(int arrSize) {
		arr = new int[arrSize];
		for(int i=0; i<arrSize; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	//Array Traversal
	public void ArrayTraversal() {
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Array No Longer Exit");
		}
		
	}
	//insert value in Array
	public void insertValueIntoArray(int location, int valueToBeInsert) {
		try {
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInsert;
				System.out.println("The value "+valueToBeInsert+" is inserted into the Location "+location);
			}
			else {
				System.out.println("The Location is occupied by another value");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the array");
		}
	}
	
	//Accessing the cell
	public void cellAccess(int cellNumber) {
		try {
			System.out.println("The element which is found in the cell "+cellNumber +" is " +arr[cellNumber]);
		}
		catch(Exception e) {
			System.out.println("Invalid Index to Access the Element");
		}
	}
	
	//Finding the element in the array
	public void SearchingAnElement(int elementToBeSearch) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == elementToBeSearch) {
				System.out.println("The element "+elementToBeSearch + " found in the Array in the position of "+i);
				return;
			}
		}
		System.out.println("Element Not Found In the Array!");
	}
	
	//Delete value from the array
	public void deleteAnElementFromArray(int deleteValueFromTheCell) {
		try {
			arr[deleteValueFromTheCell] = Integer.MIN_VALUE;
		}
		catch(Exception e) {
			System.out.println("Can't find the index to delete the element in the cell");
		}
	}
}
