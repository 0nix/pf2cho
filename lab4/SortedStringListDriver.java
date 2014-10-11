 /**
 * class SortedListDriver
 *
 *    A driver class to execute methods from SortedStringListReferenceBased.java,
 *    which creates and a reference-based list and performs methods
 *    such as adding, deleting, finding a value in a list,
 *    and returning the index number.
 *
 */



public class SortedStringListDriver
{

  public static void main(String [] args)
  {

	SortedStringListReferenceBased myGroceryList = new SortedStringListReferenceBased();
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
	myGroceryList.remove("apples");
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

	System.out.println("removing sausage...");
	myGroceryList.remove ("sausage");
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

	System.out.println("removing cheese...");
	myGroceryList.remove ("cheese");
	printList(myGroceryList);
	System.out.print("numItems is now: " + myGroceryList.size() + "\n");

  }


  public static void printList(SortedStringListReferenceBased myList)
  {
	//method prints a list, numbering the values,  e.g, "0.  milk" .... "4.  juice".... etc.
	for (int index = 0; index < myList.size(); index++)
	{
	  System.out.printf("%2d. %s\n",index, (String) myList.get(index));
    }
  }

}
