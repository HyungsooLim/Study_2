package com.hs.s3;

public class Test {

	// info3
	// 모든 정보 출력과 핸드폰 가격의 총합
	public void info3(Phone[] phones) {
		int sums = 0;
		for (int i = 0; i < phones.length; i++) {
			sums = sums + phones[i].price;
			System.out.print("회사" + "\t");
			System.out.print("이름" + "\t");
			System.out.print("가격" + "\t");
			System.out.println("색상" + "\t");
			System.out.print(phones[i].company + "\t");
			System.out.print(phones[i].name + "\t");
			System.out.print(phones[i].price + "\t");
			System.out.println(phones[i].color + "\t");
			System.out.println("---------------------------------------");
		}
		System.out.println("가격 총합 : " + sums);

	}

	// info 메소드명
	// phone의 정보를 출력
	public void info(Phone phone) {

		System.out.println("company : " + phone.company);
		System.out.println("name : " + phone.name);
		System.out.println("price : " + phone.price);
		System.out.println("color : " + phone.color);
		phone.company = "Google";

	}

	public void t1(int num) {
		num = num * 3;
		System.out.println("t1 : " + num);
	}

	// info2 메소드
	// 배열의 데이터를 모두 출력 {1,2,3}
	public void info2(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
