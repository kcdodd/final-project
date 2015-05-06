/**
 * Specialize the List interface to work with a list of sorted Strings
 * 
 * The get
 */
package sorting;

import java.util.List;

public interface SortedList extends List<String> {
	
  
    
    /**
     * finds the ordered postion of a particular string
     * 
     * @param e the string to search for
     * @return the ordered, zero based position of the string, or -1 if string is not in the list.
     */
    public int findPosition(String e);
    
}
