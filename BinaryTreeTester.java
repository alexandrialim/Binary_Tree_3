/**
 * This is a tester program for the BinaryTree class
 * @author Michael Ida
 *
 */
public class BinaryTreeTester {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		int[] inputData = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		
		for (int elem : inputData) {
			tree.insert(elem);
		}
		
		System.out.println("In-Order Traversal");
		tree.inOrder();
		System.out.println("\n\n");
		// should be: -150, -5, 0, 12, 15, 20, 20, 25, 100, 126, 200, 1000
		
		System.out.println("Pre-Order Traversal");
		tree.preOrder();
		System.out.println("\n\n");
		// should be: 20, 15, -5, -150, 0, 12, 200, 25, 20, 100, 126, 1000
		
		System.out.println("Post-Order Traversal");
		tree.postOrder();
		System.out.println("\n\n");
		// should be: -150, 12, 0, -5, 15, 20, 126, 100, 25, 1000, 200, 20
		
		System.out.println("Size: " + tree.size());
		System.out.println("\n");
		// should be: 12
		
		System.out.println("Maximum Depth: " + tree.maxDepth());
		System.out.println("\n");
		//should be: 5
		
		System.out.println("Minimum Depth: " + tree.minDepth());
		// should be: 2
		System.out.println("\n");
		
		System.out.println("Count Match:"+ " 20" +" is counted " + tree.countMatches(20) + " times");
		System.out.println("\n");
		
		System.out.println("Max record: " + tree.maxRecord());
		System.out.println("\n");
		
		System.out.println("Min record: " + tree.minRecord());
		System.out.println("\n");
		
		System.out.println("Remove Node: ");
		tree.removeNode(-5);
		tree.inOrder();
		System.out.println("\n");
		
		System.out.println("////////////////////////////////////////////////////////////");
		System.out.println("\n" + "New Tree Data:");
		System.out.println("\n");
		
		BinaryTree tree2 = new BinaryTree();
		int[] newData = {32, 10, 2, 11, -2, 0, 190, 90, -250, 96, 2500, -800};
		
		for (int elem : newData) {
			tree2.insert(elem);
		}
		
		System.out.println("In-Order Traversal");
		tree2.inOrder();
		System.out.println("\n\n");
		// should be: -800, -250, -2, 0, 2, 10, 11, 32, 90, 96, 190, 2500 
		
		System.out.println("Pre-Order Traversal");
		tree2.preOrder();
		System.out.println("\n\n");
		// should be: 32, 10, 2, -2, -250, -800, 0, 11, 190, 90, 96, 2500  
		
		System.out.println("Post-Order Traversal");
		tree2.postOrder();
		System.out.println("\n\n");
		// should be: -800, -250, 0, -2,  2, 11, 10, 96, 90, 2500, 190, 32
		
		System.out.println("Size: " + tree2.size());
		System.out.println("\n");
		// should be: 12
		
		System.out.println("Maximum Depth: " + tree2.maxDepth());
		System.out.println("\n");
		//should be: 6
		
		System.out.println("Minimum Depth: " + tree2.minDepth());
		System.out.println("\n");
		// should be: 3
		
		System.out.println("Count Match:"+ " 0" +" is counted " + tree2.countMatches(0) + " times");
		System.out.println("\n");
		
		System.out.println("Max record: " + tree2.maxRecord());
		System.out.println("\n");
		// should be: 2500
		
		System.out.println("Min record: " + tree2.minRecord());
		System.out.println("\n");
		// should be: -800
		
		System.out.println("Remove Node: ");
		tree2.removeNode(96);
		tree2.inOrder();
		System.out.println("\n");
	}

}
