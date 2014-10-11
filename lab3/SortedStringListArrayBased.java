// ********************************************************
// Array-based implementation of the ADT Sorted List.
// *********************************************************
 /**
 * class SortedStringListArrayBased
 *
 *    A class that implements the SortedListInterface using an array
 *
 */

public class SortedStringListArrayBased
{
	private static final int MAX_LIST = 50;
	private String[] items;	     // a reference to an array of String objects
	private int numItems;  	     // number of items in list


  	public SortedStringListArrayBased()
  	// creates an empty list
  	{
			items = new String[MAX_LIST];
			numItems = 0;

  	}  // end default constructor

  	public boolean isEmpty()
  	// Determines whether a list is empty
  	{
			return (numItems == 0) ? true: false;
  	} // end isEmpty

  	public int size()
  	// Returns the number of items that are in a list
  	{
  		return numItems;
  	}  // end size

  	public void removeAll()
  	// Removes all the items in the list
  	{
			items = null;
			numItems = 0;

  	} // end removeAll
  	public void add(String item) throws ListException
  	/* Inserts item into its proper position in a sorted list
  	   Throws an exception if the item connot be placed on the list*/
  	{
		if(numItems <= MAX_LIST - 1) return;
		try{
			if(numItems == 0) {
				items[0] = item;
				numItems++;
			}
			else{
				for(int i = 0; i < numItems; i++){
					if(item.compareTo(items[i]) < 0 && items[i] != null){
						for(int j = numItems - 1; j >= i; j--){
							String o = items[j];
							items[j + 1] = o;
						}
						items[i] = item;
						break;
					}
					if( i == numItems - 1) items[i + 1] = item;
				}
				numItems++;
				}
			}
			/*items[numItems] = item;
			numItems++;
			sortItems();*/	
		catch(Exception e){
			throw new ListException("Add to List failed:  " + e.toString());
		}
	}

  	public String get(int index) throws ListIndexOutOfBoundsException
  	// Retrieves the item at position index of a sorted list, if 0 <= index < size().
  	// The list is left unchanged by this operation.
  	// Throws an exception when index is out of range.
  	{
		if (index < 0 || index >= numItems)
			throw new ListIndexOutOfBoundsException(index + " is an invalid index");
		else 
			return items[index];
	}

  	public void remove(String item) throws ListException
  	// Removes the item from a sorted list.
  	// Throws an exception if the item is not found.
  	{
		try
		{
			int toDelete = locateIndex(item);
			if(toDelete < 0) return;
			for(int i = toDelete; i < numItems - 1; i++){
				String rVal = items[i + 1];
				items[i] = rVal;
			}
			items[numItems - 1] = null;
			numItems--;
			// YOUR CODE WILL BE HERE...
			// REQUIREMENT: USE "locateIndex(String item)" method.
		}
		catch(Exception e)
		{
			throw new ListException("Remove " + item.toString() + " from List failed:  " + e.toString());
		}
	}

  	public int locateIndex(String item)
  	// Returns the position (i.e., index) where the item belongs or exists in a sorted list;
  	// Otherwise, it returns -1.
  	// NOTE: (1) "locateIndex(String item)" does the same operation that "sequentialSearch" does.
  	//       (2) It is completely implemented; thus, you can just use this code as it is given.
  	{
		for (int i = 0; i < size(); i++)
			if (items[i].equals(item))
				return i;
		return -1;
	}
	// HELPER METHOD TO SORT QUICKLY. UNUSED,
	/*private void sortItems(){
		for(int i = 0; i < numItems - 1; i++){
			String org = items[i];
			int smallestI = i;
			String smallestV = items[i];
			for(int j = i+1; j < numItems; j++){
				if(smallestV.compareTo(items[j]) > 0){
					smallestV = items[j];
					smallestI = j;
				}
			}
			items[i] = smallestV;
			items[smallestI] = org;
		}
	}*/
	public String toString()
	{
		return null;
	}

}  // end SortedStringListArrayBased
