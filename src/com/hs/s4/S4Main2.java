package com.hs.s4;

import java.util.Scanner;

public class S4Main2 {

	public static void main(String[] args) {
		
		//makeArray 메소드 호출
		//리턴 받은 배열에 데이터를 입력
		Scanner sc = new Scanner(System.in);
		ReturnTest2 returnTest2 = new ReturnTest2();
		int[] ar = returnTest2.makeArray();
		for(int i = 0;i<ar.length;i++) {
			System.out.println(i+"번째 인덱스 입력");
			ar[i]=sc.nextInt();
		}
		
		//viewArray 호출
		//배열 보내기
		returnTest2.viewArray(ar);
		
		//addArray 호출
		//viewArray 호출
		
		ar=returnTest2.addArray(ar);
		returnTest2.viewArray(ar);
		
		//removeArray 호출
		//viewArray 호출
		ar=returnTest2.removeArray(ar);
		returnTest2.viewArray(ar);
		
		
		
		
		
	}
}
