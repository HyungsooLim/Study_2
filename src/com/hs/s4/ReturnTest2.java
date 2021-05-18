package com.hs.s4;

import java.util.Scanner;

public class ReturnTest2 {

	// makeArray
	// 배열의 크기를 입력받음
	// 입력받은 숫자만큼 정수를 담을 배열을 생성하고 배열 리턴
	public int[] makeArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 입력");
		int num = sc.nextInt();
		int[] ar = new int[num];
		return ar;
	}

	// viewArray
	// 매개변수로 정수배열 선언
	// 배열에 들어있는 데이터 출력
	public void viewArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + "번 index : " + ar[i]);
		}
	}

	// addArray
	// 매개변수로 정수 배열 받아서
	// 해당 배열에 한 칸ㅇ르 추가하고 데이터 입력
	// 해당 배열 리턴
	public int[] addArray(int[] ar) {
		Scanner sc = new Scanner(System.in);
		int[] ar2 = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}
		System.out.println("추가할 데이터 입력");
		ar2[ar.length] = sc.nextInt();
		ar = ar2;
		return ar;
	}

	// removeArray
	// 매개변수로 정수 배열 받아서
	// 삭제하고 싶은 숫자를 입력받음
	// 해당칸을 삭제하고
	// 배열을 리턴
	public int[] removeArray(int[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하고 싶은 숫자 입력");
		int num = sc.nextInt();
		int[] ar2 = new int[ar.length-1];
		int idx=0;
		for(int i=0;i<ar.length;i++) {
			if(num==ar[i]) {
				idx=i;
				continue;
			}
			ar2[idx]=ar[i];
			idx++;
		}
		ar=ar2;
		return ar;
	}
	
	
	
	
}
