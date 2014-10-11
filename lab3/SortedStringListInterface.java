// *****************************************************************
// Interface SortedStringListInterface for the ADT SortedStringList.
// *****************************************************************
public interface SortedStringListInterface
{

  public boolean isEmpty();
  // Determines whether a sorted list is empty

  public int size();
  // Returns the number of items that are in a sorted list

  public void add(String item) throws ListException;
  // Inserts item into it's proper position in a sorted list
  // Throws an exception if the item connot be placed on the list

  public String get(int index) throws ListIndexOutOfBoundsException;
  // Retrieves the item at position index of a sorted list, if 0 <= index < size().
  // The list is left unchanged by this operation.
  // Throws an exception when index is out of range.

  public void remove(String item) throws ListException;
  // Removes the item from a sorted list.
  // Throws an exception if the item is not found.

  public int locateIndex(String item);
  // Returns the position where the item belongs or exists in a sorted list;
  // item and the list are unchanged.

  public void removeAll();
  // Removes all the items in the list

}  // end ListInterface

