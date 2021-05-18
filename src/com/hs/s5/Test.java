package com.hs.s5;

public class Test {

	//2. 멤버변수 선언시 값을 대입
	int num=1;;
	
	//3. 생성자에 값을 대입
	public Test() {
		num=2;
	}
	
	//4.초기화 블럭
	{
		//instance 초기화 블럭
		num=3;
	}
	
	//5. 멤버 메소드 이용
	public void setNum(int num) {
		this.num = num;
	}
}
