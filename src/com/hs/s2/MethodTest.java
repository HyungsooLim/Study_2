package com.hs.s2;

public class MethodTest {

	// 접근지정자 그외지정자 리턴타입 메소드명(매개변수선언) {}
	// 접근지정자 : 모르면 무조건 public
	// 그외지정자 : 모르면 생략
	// 리턴타입 : 모르면 무조건 void
	// 매개변수선언 : 모르면 생략

	public void info() {
		// 메인메소드 내의 내용처럼 작성
		// if, for, while 등
		// 객체생성, 변수선언 전부 사용 가능
		System.out.println("info 메소드 실행");
		
		
		
		int num=10; // main에서 썼기때문에 다시 못씀
		
		
//		System.out.println("num : "+10);
		System.out.println("info 메소드 종료");
	}

	// sayHello 메소드
	// Hello World가 3번 출력되도록

	public void sayHello() {

		for (int i = 0; i < 3; i++) {
			System.out.println("Hello World");

		}
	}
	// sayHello2
	// Hello World2 1번 호출
	
	public void sayHello2() {
		System.out.println("Hello World2");
	}

}
