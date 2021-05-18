package com.hs.ex1;

import java.util.Scanner;

public class Ex1Main_3 {

	public static void main(String[] args) {
		//키보드로부터 학생 수 입력받아 학생 생성, 저장
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();
		
		Student [] students=new Student[num];
		
		for(int i=0;i<students.length;i++){
			Student student=new Student();
			students[i]=student;
			System.out.println((i+1)+"번째 학생 이름 입력");
			students[i].name = sc.next();
			System.out.println((i+1)+"번째 학생 번호 입력");
			students[i].num=sc.nextInt();
			System.out.println((i+1)+"번째 학생 국어 점수 입력");
			students[i].kor=sc.nextInt();
			System.out.println((i+1)+"번째 학생 영어 점수 입력");
			students[i].eng=sc.nextInt();
			System.out.println((i+1)+"번째 학생 수학 점수 입력");
			students[i].math=sc.nextInt();
			students[i].total=students[i].kor+students[i].eng+students[i].math;
			students[i].avg=students[i].total/3;
		}
		
		
	}
}
