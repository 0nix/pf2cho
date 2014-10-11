 /**
 * class SortedStringListDriver
 *
 *    A driver class to execute methods from SortedStringList.java, which
 *    creates a sorted list and performs methods such as adding, deleting
 *    finding a value in a list, and returning the index number.
 *
 */



public class SortedStringListDriver
{

  public static void main(String [] args)
  {

	SortedStringListArrayBased myGroceryList = new SortedStringListArrayBased();
	myGroceryList.add("milk");
	myGroceryList.add("eggs");
	myGroceryList.add("butter");
	myGroceryList.add("pecans");
	myGroceryList.add("apples");
	myGroceryList.add("bread");
	myGroceryList.add("chicken");
	myGroceryList.add("black beans");
	myGroceryList.add("rice");
	myGroceryList.add("sausage");
	myGroceryList.add("flour");

	printList(myGroceryList); //print out original List
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

    System.out.println("adding juice ...");
 	myGroceryList.add ("juice");  //add juice
    System.out.println("item 5 is: " + myGroceryList.get(5)); //get the content at index 5
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

	System.out.println("removing juice...");
	myGroceryList.remove ("juice");
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

    System.out.println("removing apples...");
	myGroceryList.remove ("apples");
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

	System.out.println("removing sausage...");
	myGroceryList.remove ("sausage"); //remove item at position (i.e., index) 5
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

	System.out.println("removing cheese...");
	myGroceryList.remove ("cheese"); //remove item at position (i.e., index) 5
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");
  }


  public static void printList(SortedStringListArrayBased myList)
  {
	//method prints a list, numbering the values,  e.g, "0.  milk" .... "4.  juice".... etc.
	for (int index = 0; index < myList.size(); index++)
	{
	  System.out.printf("%2d. %s\n",index, (String) myList.get(index));
    }
  }

}
