package com.hs.s4;

public class S4Main {

	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();

		int num = returnTest.method1(10, 20);
		System.out.println(num);

		returnTest.method2(10, 20);

		// method3 호출 후 이름 출력
		String name = returnTest.method3();
		System.out.println(name);

	}

}
