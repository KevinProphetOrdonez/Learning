
public class Node {
	Node left,right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	//###########
	//###########
	public void insert(int value) {
		if(value <= data) { //If value is lower than current node, go left
			if(left == null) {
				left = new Node(value);
			}	
			else {
				left.insert(value);
			}
		}
		else { //If value is greater than current value, go right
			if(right == null) { //If there is no right node, make a new one and place value
				right = new Node(value);
			}
			else {//If there is already a node there, recursively do this method on  this node
				right.insert(value);
			}
		}
	}
	//###########
	//###########
	public boolean contains(int value) {
		if(value == data) {
			return true;
		}
		else if (value < data) {
			if(left == null) {
				return false;
			}
			else {
				return left.contains(value);
			}
		}
		else {
			if(right == null) {
				return false;
			}
			else {
				return right.contains(value);
			}
		}
	}
	//###########
	//###########
	 public void printInOrder() {
		 if(left != null) {
			 left.printInOrder();
		 }
		 System.out.println(data);
		 if(right != null) {
			 right.printInOrder();
		 }
	 }
	//###########
	//###########
}
