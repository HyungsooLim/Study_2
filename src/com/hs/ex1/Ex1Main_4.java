package com.hs.ex1;

import java.util.Scanner;

public class Ex1Main_4 {

	public static void main(String[] args) {
		// Member Class 선언
		// id(숫자), pw(숫자), name(문자열)

		// 3명
		// 키보드로부터 id, pw, 이름을 받아서 member의 data로 작성
		// 위의 member를 배열에 대입
		Scanner sc = new Scanner(System.in);
		Member[] members = new Member[3];

		for (int i = 0; i < members.length; i++) {
			Member member = new Member();
			members[i] = member;
			System.out.println("ID 입력");
			members[i].id = sc.nextInt();
			System.out.println("PW 입력");
			members[i].pw = sc.nextInt();
			System.out.println("이름 입력");
			members[i].name = sc.next();
		}
//		// member들의 정보 출력
//		for (int i = 0; i < members.length; i++) {
//			System.out.print("ID" + "\t");
//			System.out.print("PW" + "\t");
//			System.out.println("이름" + "\t");
//			System.out.print(members[i].id + "\t");
//			System.out.print(members[i].pw + "\t");
//			System.out.println(members[i].name + "\t");
//			System.out.println("-----------------------------------------------");
//		}
		// 1. 로그인(어떤 한 사람으로 로그인하려는거)
		// 로그인 성공시 @@@님 로그인 성공 메세지 출력
		// 2. 종료
		boolean check = true;
		while (check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("ID 입력하세요");
				int id = sc.nextInt();
				System.out.println("PW 입력하세요");
				int pw = sc.nextInt();
				boolean login = false;
				for (int i = 0; i < members.length; i++) {
					if (id == members[i].id && pw == members[i].pw) {
						System.out.println(members[i].name + "님 로그인 성공");
						login = true;
						break;
					}
				}
				if (login) {
					while (login) {
						System.out.println("1. 작업시작");
						System.out.println("2. 로그아웃");
						num = sc.nextInt();
						if (num == 1) {
							// 성적관리 작업
							// 학생의 수 입력
							System.out.println("학생 수 입력");
							int count = sc.nextInt();
							Student[] students = new Student[count];
							while (login) {
								System.out.println("1. 학생정보 입력");
								System.out.println("2. 전체정보 출력");
								System.out.println("3. 학생 검색");
								System.out.println("4. 종료");
								int select = sc.nextInt();
								switch (select) {
								// 1. 학생정보 입력
								case 1:
									for (int i = 0; i < students.length; i++) {
										Student student = new Student();
										students[i] = student;
										System.out.println("학생 이름 입력");
										students[i].name = sc.next();
										System.out.println("학생 번호 입력");
										students[i].num = sc.nextInt();
										System.out.println("학생 국어점수 입력");
										students[i].kor = sc.nextInt();
										System.out.println("학생 영어점수 입력");
										students[i].eng = sc.nextInt();
										System.out.println("학생 수학점수 입력");
										students[i].math = sc.nextInt();
										students[i].total = students[i].kor + students[i].eng + students[i].math;
										students[i].avg = students[i].total / 3;
									}
									break;
								// 2. 전체정보 출력
								case 2:
									for (int i = 0; i < students.length; i++) {
										System.out.print("이름" + "\t");
										System.out.print("번호" + "\t");
										System.out.print("국어" + "\t");
										System.out.print("영어" + "\t");
										System.out.print("수학" + "\t");
										System.out.print("총점" + "\t");
										System.out.println("평균" + "\t");
										System.out.print(students[i].name + "\t");
										System.out.print(students[i].num + "\t");
										System.out.print(students[i].kor + "\t");
										System.out.print(students[i].eng + "\t");
										System.out.print(students[i].math + "\t");
										System.out.print(students[i].total + "\t");
										System.out.println(students[i].avg + "\t");
										System.out.println("-----------------------------------------------");
									}
									break;
								// 3. 학생 검색 출력(학생번호입력)
								case 3:
									System.out.println("검색할 학생 번호 입력");
									int search = sc.nextInt();
									for (int i = 0; i < students.length; i++) {
										if (search == students[i].num) {
											System.out.print("이름" + "\t");
											System.out.print("번호" + "\t");
											System.out.print("국어" + "\t");
											System.out.print("영어" + "\t");
											System.out.print("수학" + "\t");
											System.out.print("총점" + "\t");
											System.out.println("평균" + "\t");
											System.out.print(students[i].name + "\t");
											System.out.print(students[i].num + "\t");
											System.out.print(students[i].kor + "\t");
											System.out.print(students[i].eng + "\t");
											System.out.print(students[i].math + "\t");
											System.out.print(students[i].total + "\t");
											System.out.println(students[i].avg + "\t");
											System.out.println("-----------------------------------------------");
											break;
										}
										System.out.println("검색 정보 없음");
									}
									break;
								case 4:
									login = false;
								}// case_1234 로그인 후 작업 메뉴 끝
							} //

							// 1. 학생정보 입력
							// 2. 전체정보 출력
							// 3. 학생 검색 출력(학생번호입력)
							// 4. 종료
						} else {
							System.out.println("로그아웃");
							break;
						}
					} // while 로그인 후 작업시작/종료 끝
					continue;
				} else {
					System.out.println("로그인 실패");
				}

			case 2:
				check = false;
			}

		} // while 멤버 로그인/종료 끝
		System.out.println("---프로그램 종료---");
	} // main 끝
}
