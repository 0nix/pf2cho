 /**
  Lab6 for Dr. Cho
  by Eduardo de Luna
  **/
 public class IsPalindrome {
	public static void main(String[] arg){
		IsPalindrome isp = new IsPalindrome();
		if(arg.length == 0)
		  System.out.println("Please include the word to be checked as an argument for execution");
		else{
		boolean isapal = isp.isPalindrome(arg[0]);
		if(isapal) System.out.println(arg[0]+" is a palindrome");
		else System.out.println(arg[0]+" is not a palindrome");
		}
	}
	public boolean isPalindrome(String str){
		QueueReferenceBased queue = new QueueReferenceBased();
		StackReferenceBased stack = new StackReferenceBased();
		for(int i = 0; i < str.length(); i++){
			queue.enqueue(str.charAt(i));
			stack.push(str.charAt(i));
		}
		while(!queue.isEmpty()){
			if(queue.dequeue() != stack.pop())
				return false;
		}
		return true;
	}
}
