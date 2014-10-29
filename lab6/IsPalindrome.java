public class IsPalindrome {
	public static void main(String[] arg){
		IsPalindrome isp = new IsPalindrome();
		boolean isapal = isp.isPalindrome(arg[0]);
		if(isapal) System.out.println(arg[0]+" is a palindrome");
		else System.out.println(arg[0]+" is not a palindrome");
	}
	public boolean isPalindrome(String str){
		QueueReferenceBased queue = new QueueReferenceBased();
		StackReferenceBased stack = new StackReferenceBased();
		for(int i = 0; i < str.length(); i++){
			queue.enqueue(str.charAt(i));
			stack.push(str.charAt(i));
		}
		while(!queue.isEmpty()){
			System.out.println(queue.peek() + " "+stack.peek());
			if(queue.dequeue() != stack.pop())
				return false;
		}
		return true;
	}
}