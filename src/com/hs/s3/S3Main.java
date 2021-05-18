package com.hs.s3;

public class S3Main {

	public static void main(String[] args) {

		Test test = new Test();
		int num = 10;
		test.t1(num);
		System.out.println("main : " + num);

		Phone phone = new Phone();
		phone.company = "Apple";
		phone.name = "Iphone 12 pro";
		phone.price = 150;
		phone.color = "Spacegray";
		test.info(phone);
		System.out.println("-------------------------------");
		
		System.out.println(phone.company);
		
		
		
		System.out.println("-------------------------------");
		int [] ar = {1,2,3};
		test.info2(ar);

	}
}
