package com.hs.s3;

import java.util.Scanner;

public class S3Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("제작할 핸드폰의 갯수 입력");
		// 핸드폰의 갯수만큼 정보를 입력
		int count = sc.nextInt();
		Test test = new Test();
		Phone[] phones = new Phone[count];

		for (int i = 0; i < phones.length; i++) {
			phones[i] = new Phone();
			System.out.println("회사 입력");
			phones[i].company = sc.next();
			System.out.println("이름 입력");
			phones[i].name = sc.next();
			System.out.println("가격 입력");
			phones[i].price = sc.nextInt();
			System.out.println("색상 입력");
			phones[i].color = sc.next();
		}

		test.info3(phones);

	}
}
