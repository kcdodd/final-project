/**
 * 
 * Class containing main method for testing sorting implementations
 */

package sorting;

public class SortingMain {
	
	public static void main(String[] args) {
		
		SortedList myList = new ArraySortedList();
		
		myList.add("hello");
		
		myList.add("world");
		
		for(String s : myList){
			System.out.println(s);
		}
		
		SortedList anotherList = new ArraySortedList(myList);
		
		for(String s : anotherList){
			System.out.println(s);
		}
	}
}
