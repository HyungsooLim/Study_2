package com.hs.ex4;

import java.util.Scanner;

public class StudentController {

	//method name : start
	//1. 학생정보입력
	//		- studentInput
	//2. 학생정보출력
	//		- studentView
	//3. 학생정보검색
	//4. 학생정보추가
	//5. 학생정보삭제
	//6. 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentService();
		Student[] students=new Student[0];
		boolean check = true;
		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 학생정보삭제");
			System.out.println("6. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				students = studentService.studentInput();
				break;
			case 2:
				studentService.studentView(students);
				break;
			case 3:
				studentService.studentSearch(students);
				break;
			case 4:
				students=studentService.studentAdd(students);
				break;
			case 5:
				students=studentService.studentDelete(students);
				break;
			case 6:
				check = false;
				break;
			}
		}
		System.out.println("---프로그램 종료---");
	}
					
}
