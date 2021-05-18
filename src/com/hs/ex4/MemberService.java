package com.hs.ex4;

import java.util.Scanner;

public class MemberService {
	
	Scanner sc;

	public MemberService() {
		sc = new Scanner(System.in);
	}
	// 회원가입 메소드
	// memberJoin
	// 가일할 회원 수 입력
	// 회원수 만큼 회원 생성
	// 정보를 입력
	// 회원들을 리턴
	public Member[] memberJoin() {
		System.out.println("가입 할 회원 수 입력");
		int num = sc.nextInt();
		Member[] members = new Member[num];
		for (int i = 0; i < members.length; i++) {
			members[i] = new Member();
			System.out.println("ID 입력");
			members[i].id = sc.nextInt();
			System.out.println("PW 입력");
			members[i].pw = sc.nextInt();
			System.out.println("이름 입력");
			members[i].name = sc.next();
		}
		return members;

	}

	// 로그인 메소드
	// memberLogin
	// id, pw입력
	// 매개변수로 member들을 받아서 선언
	// 검사결과를 return
	public Member memberLogin(Member[] members) {
		Member member = new Member();
		Member result = null;
			System.out.println("ID 입력");
			int id = sc.nextInt();
			System.out.println("PW 입력");
			int pw = sc.nextInt();
			for (int i = 0; i < members.length; i++) {
				if (id == members[i].id && pw == members[i].pw) {
					result = members[i];
					break;
				}
			}

		
		member = result;
		return member;
	}

}
