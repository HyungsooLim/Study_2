package com.hs.ex4;

public class Ex4Main {

	public static void main(String[] args) {
//		// test 용도로 여기서 출력
//		// member 정보 전체 출력
//		MemberService memberService = new MemberService();
//		Member[] members = memberService.memberJoin();
//
//		// memberLogin 시도
//		// 로그인 성공하면 @@@님 로그인 성공 출력
//		// 로그인 실패하면 로그인 실패 출력
//		Member member = memberService.memberLogin(members);
//		if (member != null) {
//			System.out.println(member.id + "님 로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}

		// MemberController
		// start 메소드 실행
		MemberController memberController = new MemberController();
		memberController.start();

		//student영역
//		StudentService studentService=new StudentService();
//		StudentController studentController = new StudentController();
//		studentController.start();
//		Student[] students = studentService.studentInput();
//		studentService.studentView(students);
		
		
	}
}
