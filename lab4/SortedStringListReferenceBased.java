// ********************************************************
// Reference-based implementation of the ADT Sorted List.
// *********************************************************
 /**
 * class SortedListReferenceBased
 *
 *    A class that implements the SortedListInterface using a linked list
 *
 */
public class SortedStringListReferenceBased implements SortedStringListInterface
{
	private Node head;
  	private int numItems;  // number of items in list

  	public SortedStringListReferenceBased()
  	// creates an empty list
  	{
		head = null;
		numItems = 0;
  	}  // end default constructor

  	public boolean isEmpty()
  	// Determines whether a list is empty
  	{
		return (numItems == 0) ? true:false;
  	} // end isEmpty

  	public int size()
  	// Returns the number of items that are in a list
  	{
  		return numItems;
  	}  // end size

  	public void removeAll()
  	// Removes all the items in the list
  	{
		head = null;
		numItems = 0;
  	} // end removeAll

  	public void add(String item) throws ListException
  	// Inserts item into its proper position in a sorted list
  	// Throws an exception if the item connot be placed on the list
  	{
		try
		{
			if(head == null)
				head = new Node(item);
			if(item.compareTo(head.getData()) < 0){
				Node temp = head;
				head = new Node(item, temp);
			}
			else{
				Node current = head;
				Node next = null;
				for(int i = 0; i < numItems; i++){
					next = current.getNext();
					if((next != null) && (item.compareTo(next.getData()) < 0)){
						current.setNext(new Node(item, next));
						break;
					}
					else if (next == null) current.setNext(new Node(item));
					else current = next;
				}
			}
			numItems++;
			// YOUR CODE WILL BE HERE...
			// DEFINE ANY HELPER METHOD(S) AND CALL IT/THEM, IF YOU NEED ANY.
		}
		catch(Exception e)
		{
			throw new ListException("Add to List failed:  " + e.toString());
		}

	}

  	public String get(int index) throws ListIndexOutOfBoundsException
  	// Retrieves the item at position index of a sorted list, if 0 <= index < size().
  	// The list is left unchanged by this operation.
  	// Throws an exception when index is out of range.
  	{
		if (index >= numItems)
			throw new ListIndexOutOfBoundsException(index + " is an invalid index");
		Node current = head;
		Node next = null;
		int i = 0;
		while( i <= index){
			next = current.getNext();
			if(i == index) return current.getData();
			else{
				current = next;
				i++;
			}
		}
		return null;
	}

  	public void remove(String item) throws ListException
  	// Removes the item from a sorted list.
  	// Throws an exception if the item is not found.
  	{
		try
		{
			// YOUR CODE WILL BE HERE...
			// REQUIREMENT: USE "locateIndex(String item)" method.
			int ri = locateIndex(item);
			if(ri >= 0){
				if(ri == 0) head = head.getNext();
				else{
					Node current = head;
					Node next = null;
					int i = 1;
					while(i <= ri){
						next = current.getNext();
						if( i == ri){
							Node end = current.getNext().getNext();
							current.setNext(end);
							break;

						}else{
							i++;
							current = next;
						}
					}
				}
				numItems--;
			}
			else{return;}

		}
		catch(Exception e)
		{
			throw new ListException("Remove " + item.toString() + " from List failed:  " + e.toString());
		}
	}

	public int locateIndex(String item)
  	// Returns the position where the item belongs or exists in a sorted list;
  	// item and the list are unchanged.
  	{
		// YOUR CODE WILL BE HERE...
		Node current = head;
		Node next = null;
		int i = 0;
		while( i < numItems){
			next = current.getNext();
			if(current.getData().equals(item))
				return i;
			else{
				current = next;
				i++;
			}
		}
		return -1;
	}

}  // end SortedListReferenceBased