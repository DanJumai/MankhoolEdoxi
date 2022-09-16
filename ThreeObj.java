package assignment;

public class ThreeObj {
	int age;
	String name;
	String years;
	
	public void Intro(String n,int a,String y) {
		age = a;
		name =n;
		years = y;
		System.out.println(name+ "   "+age +years);
	}
	

	public static void main(String[] args) {
		ThreeObj obj1 = new ThreeObj();
		ThreeObj obj2 = new ThreeObj();
		ThreeObj obj3 = new ThreeObj();
		obj1.Intro("My name is John, i am ", 5,"years old");
		obj2.Intro("My name is Maja, i am ", 65,"years old");
		obj3.Intro("My name is Daniel, i am ", 85,"years old");
		

	}

}

