
public class MyArray {
	
	int[] array;
	
	public MyArray(){
		array = new int[] {0,1,2,3,4,5,6,7,8,9};
		
	}
	
	public void printArray() {
		for(int elem:array) {
			System.out.print(elem);
		}
		System.out.println(" ");
	}
	
	// O(N^2) time complexity for rotating an Array
	// O(1) space complexity
	public void Rotate(int NumOfRotations) {
		
		for(int i = 0; i < NumOfRotations; i++) {
			RotateByOne();
		}
		printArray();
	}
	
	private void RotateByOne() {
		int i;
		int temp = array[0];;
		for(i = 0; i < array.length - 1; i++ ) {
			array[i] = array[i+1];
		}
		array[i] = temp;
	}
	// O(N^2) time complexity for rotating an Array
	// O(1) space complexity
	
	// O(n) time complexity for rotating an array
	// o(1) space complexity
	public void QuickRotate(int NumOfRotations) {
		
		reverse(0, NumOfRotations);
		//reverse(NumOfRotations, array.length);
		//reverse(0, array.length);
		
		
		printArray();
	}
	private void reverse(int startIndex, int endIndex) {
		int head = startIndex;
		int length = endIndex -1;
		int tail = endIndex;
		
		if(endIndex < 2) {//No need for a swap rotating only 1 element
			return;
		}
		else {
			while(head < length/2) {
				int temp = array[head];
				array[head] = array[tail];
				array[tail] = temp;
				
				head++; 
				tail--;
			}
		}
		
	}
	// O(n) time complexity for rotating an array
	// O(1) space complexity
}
