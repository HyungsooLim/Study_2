package com.hs.ex1;

public class Ex1Main_2 {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.name="메시";
		Student st2 = new Student();
		st2.name="호날두";
		
		//배열
		//같은 데이터타입
		//배열선언
		Student[] sts = new Student[2];
		//배열 학생 대입
		sts[0]=st1;
		sts[1]=st2;
		//배열에 있는 이름들 출력
		System.out.println(sts[0].name);
		System.out.println(sts[1].name);
		
		
		
	}
}
