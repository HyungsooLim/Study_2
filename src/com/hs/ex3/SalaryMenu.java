package com.hs.ex3;

import java.util.Scanner;

public class SalaryMenu {

	// start 메소드
	// 1. 급여계산
	// -- 급여 입력
	// -- 1. 정규직
	// -- getSal
	// -- 2. 계약직
	// -- getSal2
	// 2. 프로그램종료
	public void start() {
		Salary salary = new Salary();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.print("1. 급여계산" + "\t");
			System.out.println("2. 프로그램 종료");
			int select = sc.nextInt();
			boolean check2 = true;
			while (check2) {
				switch (select) {
				case 1:
					System.out.println("급여 입력");
					int getSal = sc.nextInt();
					System.out.print("1. 정규직" + "\t");
					System.out.println("2. 계약직");
					select = sc.nextInt();
					switch (select) {
					case 1:
						salary.getSal(getSal);
						check2 = false;
						break;
					case 2:
						salary.getSal2(getSal);
						check2 = false;
						break;
					}
					break;
				case 2:
					System.out.println("프로그램 종료");
					check2 = false;
					check = false;
				}
			}
		}

	}

}
