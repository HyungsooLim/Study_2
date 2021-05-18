package com.hs.ex4;

import java.util.Scanner;

public class StudentService {

	// method name : studentInput
	// 학생의 숫자를 입력받음
	// 학생의 정보 입력받음
	// 학생들을 return
	public Student[] studentInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 숫자를 입력하세요");
		int num = sc.nextInt();
		Student[] students = new Student[num];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println(i + 1 + "번째 학생 이름 입력");
			students[i].name = sc.next();
			System.out.println(i + 1 + "번째 학생 번호 입력");
			students[i].num = sc.nextInt();
			System.out.println(i + 1 + "번째 학생 국어점수 입력");
			students[i].kor = sc.nextInt();
			System.out.println(i + 1 + "번째 학생 영어점수 입력");
			students[i].eng = sc.nextInt();
			System.out.println(i + 1 + "번째 학생 수학점수 입력");
			students[i].math = sc.nextInt();
			students[i].total = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = students[i].total / 3;
		}
		return students;
	}

	// method name : studentView
	// 학생들 정보를 받아서 출력
	public void studentView(Student[] students) {
		if (students == null) {
			System.out.println("학생 정보 없음");
			return;
		}
		System.out.print("이름" + "\t");
		System.out.print("번호" + "\t");
		System.out.print("국어" + "\t");
		System.out.print("영어" + "\t");
		System.out.print("수학" + "\t");
		System.out.print("총점" + "\t");
		System.out.println("평균" + "\t");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].num + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].total + "\t");
			System.out.println(students[i].avg + "\t");
			System.out.println("------------------------------------------------------------------------");
		}
	}

	// studentSearch
	// 학생정보검색
	public void studentSearch(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생 번호 입력");
		int num = sc.nextInt();
		boolean check = true;
		for (int i = 0; i < students.length; i++) {
			if (num == students[i].num) {
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
				System.out.println("------------------------------------------------------------------------");
				check = false;
				break;
			}
		}
		if (check == true) {
			System.out.println("검색 정보 없음");
		}
	}

	// studentAdd
	// 학생정보추가
	public Student[] studentAdd(Student[] students) {
		Scanner sc = new Scanner(System.in);
		Student[] studentAdds = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			studentAdds[i] = students[i];
		}
		studentAdds[students.length] = new Student();
		System.out.println("학생 이름 입력");
		studentAdds[students.length].name = sc.next();
		System.out.println("학생 번호 입력");
		studentAdds[students.length].num = sc.nextInt();
		System.out.println("학생 국어점수 입력");
		studentAdds[students.length].kor = sc.nextInt();
		System.out.println("학생 영어점수 입력");
		studentAdds[students.length].eng = sc.nextInt();
		System.out.println("학생 수학점수 입력");
		studentAdds[students.length].math = sc.nextInt();
		studentAdds[students.length].total = studentAdds[students.length].kor + studentAdds[students.length].eng
				+ studentAdds[students.length].math;
		studentAdds[students.length].avg = studentAdds[students.length].total / 3;
		students = studentAdds;
		return students;
	}

	// studentDelete
	// 학생정보삭제
	public Student[] studentDelete(Student[] students) {
		Scanner sc = new Scanner(System.in);
		Student[] studentDeletes = new Student[students.length - 1];
		int idx = 0;
		System.out.println("삭제할 학생 번호 입력");
		int num = sc.nextInt();
		for (int i = 0; i < students.length; i++) {
			if (num == students[i].num) {
				continue;
			}
			studentDeletes[idx] = students[i];
			idx++;
		}
		students = studentDeletes;
		return students;
	}

}
