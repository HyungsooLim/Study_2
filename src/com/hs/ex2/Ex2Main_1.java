package com.hs.ex2;

public class Ex2Main_1 {

	public static void main(String[] args) {
		//Object 생성
		Character character = new Character();
		
		character.name="춘식";
		character.hp=100;
		character.sword=new Sword();
		character.sword.name = "둠해머";
		
		System.out.println(character.name);
		System.out.println(character.hp);
		System.out.println(character.sword.name);
		System.out.println(character.sword);
		
	}
}
