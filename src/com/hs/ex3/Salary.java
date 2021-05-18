package com.hs.ex3;

public class Salary {
	// 클래스명 Salary
	// 메소드명 getSal
	// 받은 급여에 세금을 제하고 실급여 출력
	// 국민연금 1.2%, 의료보험 2.2%, 실업급여 0.5%, 산재보험 0.3%
	// 메소드명 getSal2
	// 받은 급여에 원천징수 3.3%
	public void getSal(int getSal) {

		double realSal = (int) (getSal * 0.96);

		System.out.println("실급여 : " + realSal);
	}
	public void getSal2(int getSal) {
		
		double realSal2 = getSal*0.967;
		
		System.out.println("실급여 : "+realSal2);
	}
}
