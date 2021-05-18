package com.hs.s2;

public class S2Main {

	public static void main(String[] args) {

		MethodTest methodTest = new MethodTest();
		// 멤버메소드 접근
		// 메소드 호출
		// 참조변수명.멤버메소드()

		int num = 20;
		
		methodTest.info();
		

		methodTest.sayHello();
		System.out.println("--------------------");
		
		// sayHello2 호출
		for (int i = 0; i < 3; i++) {
			methodTest.sayHello2();
		}
		
		
		
		
		
		
		
	}
}
