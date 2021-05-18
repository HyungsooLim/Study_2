package com.hs.s1;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {

		System.out.println("S1Main 실행");
		// 변수 선언 공식
		// 데이터타입 변수명 =
		// 객체 생성 공식
		// 클래스명 변수명 = new 클래스명();
		Member member1 = new Member(); // 회원 1명 생성된거임 <- 객체
		Member member2 = new Member();

		Scanner sc = new Scanner(System.in);

		member1.id = "test";
		member1.pw = "password";
		member1.age = 20;
		member1.height = 180.2;

		member2.id = "test";
		member2.pw = "password";
		member2.age = 20;
		member2.height = 180.2;

		System.out.println(member1.id);
		System.out.println(member2.age);

		System.out.println(member1 == member2); // false? -> O
		System.out.println(member1);
		System.out.println(member2);

		member1 = member2; // 얕은 복사

		System.out.println(member1 == member2);
	}
}
