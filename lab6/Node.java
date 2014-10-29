public class Node{
	private Object data = null;
	private Node next = null;
	public Node(Object value){
		data = value;
	}
	public Node(Object value, Node n){
		data = value;
		next = n;
	}
	public Object getItem(){
		return data;
	}
	public void setItem(Object value){
		data = value;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node n){
		next = n;
	}
}