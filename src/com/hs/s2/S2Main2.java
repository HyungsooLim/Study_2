package com.hs.s2;

import java.util.Scanner;

public class S2Main2 {

	public static void main(String[] args) {

		MethodTest2 methodTest2 = new MethodTest2();
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 숫자 입력");
		int num1 = sc.nextInt();
		System.out.println("2번째 숫자 입력");
		int num2 = sc.nextInt();
		
		methodTest2.sum(num1,num2); // (괄호 안) <- 인자값 : 보내는 값

	}
}
