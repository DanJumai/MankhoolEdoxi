package assignment;

public class StatMem {
	
	public static int a;
	public static int b;
	public static int c;
	
	static int Addition() {
		a = 20;
		b = 5;
		c = 6;
		return a+b+c;
	}
public static void main(String [] args) {
	System.out.println(Addition());
}
}
