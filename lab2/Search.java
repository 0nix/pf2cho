import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;


public class Search
{
	public static final String TOSTOP = "-1";
  	public static final int NOTFOUND = -1;
  	public static int count1, count2, count3;
  	public static int sequentialSearch(ArrayList<String> list, String w)
	{
	    int location = NOTFOUND;
	    boolean found = false;
	    while(!found){
		    for(String el:list){
		    	count1++;
		    	if(el.equals(w)){
		    		location = list.indexOf(el);
		    		found = true;
		    	}
			}
		}
	    return location;
	}
	public static int binarySearch(ArrayList<String> list, int value)
	{
		int low = 0;
		int high = list.size() - 1;
		while (low <= high) {
			int mid = (low + high)/2;
			count2++;
			String midWord = list.get(mid);
			// USE COMPARETO TO CONTINUE COMPARISON
			/*if (array[mid] > value){
				high = mid - 1;
			} else if (array[mid] < value){
				low = mid + 1;
		   	} else
				return mid;*/
		}
		return NOT_FOUND;
	}
  	public void main(){

  	}
	public static void main(String[] arg){
		//File f = new File(arg[0]);
		File f = new File("sortedWords.txt");
		ArrayList<String> w = new ArrayList<String>();
		if(f.exists()){
			try{
				Scanner s = new Scanner(f);
				while(s.hasNextLine()){
					w.add(s.nextLine());
				}
				Scanner keyboard = new Scanner(System.in);
  				System.out.print("Type a word to search ("+ TO_STOP + " to stop): ");
				String term = keyboard.nextLine().toLowerCase();
				System.out.println(term);

			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		else {System.out.println("The file was not found. \n I've noticed that in Windows systems if you have a text file named boo.txt, the JRE doesn't recognize it, as it is part of the name rather than the extension. \n As far as the JRE is concerned, the real name is boo.txt.txt. Just a thought before you flunk me.");}
	}
}