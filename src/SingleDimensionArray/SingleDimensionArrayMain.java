package SingleDimensionArray;

public class SingleDimensionArrayMain {

	public static void main(String[] args) {
		SingleDimensionArray obj = new SingleDimensionArray();
		System.out.println("Creating Array of 10 elements");
		obj.singleDimensionArray(10);
		obj.ArrayTraversal();
		
		
		System.out.println("\n\n***********inserting the few values in array**************");
		obj.insertValueIntoArray(0, 10);
		obj.insertValueIntoArray(1, 20);
		obj.insertValueIntoArray(2, 30);
		obj.insertValueIntoArray(3, 40);
		obj.insertValueIntoArray(4, 50);
		obj.insertValueIntoArray(5, 60);
		obj.insertValueIntoArray(6, 70);
		obj.insertValueIntoArray(7, 80);
		obj.insertValueIntoArray(8, 90);
		obj.insertValueIntoArray(9, 100);
		obj.insertValueIntoArray(1, 17);
		obj.insertValueIntoArray(12, 18);
		
		System.out.println("\n\n*********Accessing the element in the cell************");
		obj.cellAccess(3);
		obj.cellAccess(-1);
		
		System.out.println("\n\n********Searching element in Array******************");
		obj.SearchingAnElement(30);
		obj.SearchingAnElement(18);
		
		System.out.println("\n\n*********Delete element in particular cell******");
		System.out.println("before delete the element in the cell");
		obj.ArrayTraversal();
		obj.deleteAnElementFromArray(4);
		System.out.println("After Deleteing the element in the cell");
		obj.ArrayTraversal();
	}

}
