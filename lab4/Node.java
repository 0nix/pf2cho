public class Node{
	private String data = null;
	private Node next = null;
	public Node(String value){
		data = value;
	}
	public Node(String value, Node n){
		data = value;
		next = n;
	}
	public String getData(){
		return data;
	}
	public void setData(String value){
		data = value;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node n){
		next = n;
	}
}