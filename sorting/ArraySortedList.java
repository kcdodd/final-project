/**
 * Specialized ArrayList to work with a list of sorted Strings
 */
package sorting;

import java.util.ArrayList;
import java.util.Collection;

public class ArraySortedList extends ArrayList<String> implements SortedList {
	
	/**
	 * Creates an empty sorted list.
	 */
	public ArraySortedList () {
		super();
	}
	
	/**
	 * Creates a sorted list from a potentially unsorted collection
	 */
	public ArraySortedList (Collection<String> list) {
		
		// must replace this code to ensure that this list is sorted
		super(list);
	}
	
	/**
	 * Implements SortedList.findPosition
	 */
	public int findPosition(String e) {
		
		// must replace code to return actual position of string
		return -1;
	}
	
	
	/**
	 * Overrides ArrayList.add
	 */
	public boolean add(String e){
		
		// must replace code to ensure list remains sorted after adding the string
		return super.add(e);
	}
}
