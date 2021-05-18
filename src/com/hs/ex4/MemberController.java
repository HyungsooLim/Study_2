package com.hs.ex4;

import java.util.Scanner;

public class MemberController {

	Scanner sc;
	MemberService memberService;
	Member[] members;
	StudentController studentController;
	public MemberController() {
		sc = new Scanner(System.in);
		memberService = new MemberService();
		members = memberService.memberJoin();
		studentController = new StudentController();
	}
	// 메소드명 start
	// memberJoin 실행
	// 1. 로그인
	// 2. 종료
	// 종료할때까지 반복
	// 로그인 성공 시 성공 출력
	public void start() {
		boolean check = true;
		while (check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				Member member = memberService.memberLogin(members);
				if (member != null) {
					System.out.println(member.id + "님 로그인 성공");
					studentController.start();
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 2:
				System.out.println("---프로그램 종료---");
				check = false;
				break;
			}
		}
	}
}
