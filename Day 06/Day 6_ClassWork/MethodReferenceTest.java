package com.coforge.day6.java8;

interface MyReference {
	void showMessage();
}

public class MethodReferenceTest {
	
	void myInstanceMethod() {
		System.out.println("Example for Instance Method Reference");
	}
	
	static void myStaticMethod() {
		System.out.println("Example for Static Method Reference");
	}
	
	MethodReferenceTest() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		//Reference to instance method
		MethodReferenceTest obj = new MethodReferenceTest();
		MyReference reference = obj::myInstanceMethod;
		reference.showMessage();
		
		//Reference to a static Method
		reference = MethodReferenceTest::myStaticMethod;
		reference.showMessage();
		
		//Reference to a Constructor
		reference = MethodReferenceTest::new;
		reference.showMessage();
	}

}
