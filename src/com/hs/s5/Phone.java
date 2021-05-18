package com.hs.s5;

public class Phone {

	int price;
	double point;
	
	//기본생성자
	public Phone() {
		price = 200;
		point = 3.3;
	}

	// 1번
	public boolean check2(int price, double point) {
		// 매개변수 price와 멤버변수 price와 값이 같고
		// 매개변수 point와 멤버변수 point와 값이 같으면 true
		// 아니면 false 리턴
		boolean check = false;
		if (price == this.price && point == this.point) {
			check = true;
		}
		return check;

	}

	// 2번
	public boolean check(Phone phone) {
		// 멤버변수끼리 서로 값이 같은지 비교
		// 값이 같은지 비교
		boolean check = false;
		if (phone.price == this.price && phone.point == this.point) {
			check = true;
		}
		return check;
	}

}
