package com.hs.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 3; i++) {
		Student student1 = new Student();
		for (int i = 0; i < 3; i++) {
			System.out.println("이름 입력");
			student1.name = sc.next();
			System.out.println("번호 입력");
			student1.num = sc.nextInt();
			System.out.println("국어점수 입력");
			student1.kor = sc.nextInt();
			System.out.println("영어점수 입력");
			student1.eng = sc.nextInt();
			System.out.println("수학점수 입력");
			student1.math = sc.nextInt();
			student1.total = student1.kor + student1.eng + student1.math;
			student1.avg = student1.total / 3;

			System.out.print(student1.name + "\t");
			System.out.print(student1.num + "\t");
			System.out.print(student1.kor + "\t");
			System.out.print(student1.eng + "\t");
			System.out.print(student1.math + "\t");
			System.out.print(student1.total + "\t");
			System.out.print(student1.avg + "\t");
		}
	}
}
