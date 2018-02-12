
public class Main {
	
	public static void main(String[] args) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
		
		StringTraining stringTrainer = new StringTraining();
		stringTrainer.DetectPalindrone();
		
		ArrayTraining arrayTrainer = new ArrayTraining();
		arrayTrainer.MergeLists();
		
		Node tree = new Node(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(8);
		
		System.out.println(" ");
		System.out.println(tree.contains(7));
		System.out.println(tree.contains(8));
		
		tree.printInOrder();
	}
}
