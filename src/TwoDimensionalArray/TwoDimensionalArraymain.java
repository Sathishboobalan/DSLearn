package TwoDimensionalArray;

public class TwoDimensionalArraymain {
	public static void main(String[] args) {
		TwoDimensionalArray obj = new TwoDimensionalArray();
		
		System.out.println("Creting the blank array of 5 * 5");
		obj.twoDimensionaArray(5,5);
		System.out.println("\n***Array traversal***");
		obj.arrayTraversal();
		System.out.println("\n****Inserting element into the array****");
		obj.insertElemetIntoArray(2, 3, 1000000123);
		obj.insertElemetIntoArray(1, 1, 1340210123);
		System.out.println("\n*****After insertion the element into the array*****");
		obj.arrayTraversal();
		System.out.println("\n****Finding the element which is found in the postion*****");
		obj.accessTheArray(2, 1);
		obj.accessTheArray(6, 1);
		System.out.println("\n****Finding the element position in the array****");
		obj.searchingElementInTheArray(1000210123);
		obj.searchingElementInTheArray(12);
		System.out.println("\n*****Deleting element from the array*****");
		System.out.println("\n*****Before deleting the element from the array*****");
		obj.arrayTraversal();
		obj.deletingElementInArray(1,1);
		System.out.println("\n*****After Deleting element from the array*****");
		obj.arrayTraversal();
		System.out.println("\n*****Deleting entire array*****");
		obj.deletingEntireArray();
	}
}
