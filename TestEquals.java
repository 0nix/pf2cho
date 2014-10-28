public class TestEquals{

	public static void print(boolean b){
		System.out.println(b);
	}
	public static void print(int i){
		System.out.println(i);
	}
	public static void main(String[] arg){
		String a = new String("apple");
		String b = new String("apple");
		String c = "banana";
		String d = "banana";
		a = new String("banana");
		print(a == b);
		print(a == c);
		print(c == d);
		print(a.equals(c));
		print(c.equals(d));
		print(a == c);
		print(a.compareTo(b));
		print(a.compareTo(c));
		print(c.compareTo(d));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}
}
