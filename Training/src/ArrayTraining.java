import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayTraining {
	private int[] array = new int[] {1,2,3,4,5,6};
	
	LinkedList<Integer> list1 = new LinkedList<Integer>();
	LinkedList<Integer> list2 = new LinkedList<Integer>();
	LinkedList<Integer> mergedList = new LinkedList<Integer>();
	
	public void reverseArray () {
		
		for (int i = 0; i < array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length -i -1] = temp;
		}
		for (int element:array) {
			System.out.print(element);
		}
	}
	
	LinkedList<Integer> MergeLists() {
		  if (list1 == null) return list2;
		  if (list2 == null) return list1;
		  list1.add(1);
		  list1.add(3);
		  list1.add(5);
		  list2.add(2);
		  list2.add(4);
		  list2.add(6);
		  
		  Integer list1Value;
		  Integer list2Value;
		  
		  ListIterator<Integer> list1Itr = list1.listIterator();
		  ListIterator<Integer> list2Itr = list2.listIterator();
		  
		  while (list1Itr.hasNext() && list2Itr.hasNext()) {
			  list1Value = list1Itr.next(); 
			  list2Value = list2Itr.next(); 
			  
			  if (list1Value < list2Value) {
			    mergedList.add(list1Value);
			    list1Itr.remove();
			    list2Value = list2Itr.previous();
			  } else {
			    mergedList.add(list2Value);
			    list2Itr.remove();
			    list1Value = list1Itr.previous(); 
				  
			  }
			  if(!list1Itr.hasNext()) {
				  mergedList.addAll(list2);
			  }
			  if(!list2Itr.hasNext()) {
				  mergedList.addAll(list1);
			  }
		}
		  
		for(Integer elem:mergedList) {
			System.out.print(elem);
		}
		return mergedList;
		
	}
	
}
