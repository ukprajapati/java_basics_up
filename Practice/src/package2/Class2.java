package package2;

import package1.Class1;

public class Class2 extends Class1{
	
	public Class2() {
		// TODO Auto-generated constructor stub
		final int a=2;
	}
	
	
	public static void main(String[] args) {
		new Class2();
		Class2 c2 = new Class2();
		c2.display();
		System.out.println("Hello1");
	}
}
