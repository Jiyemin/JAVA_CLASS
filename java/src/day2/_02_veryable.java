package day2;

import java.net.MulticastSocket;

public class _02_veryable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; //문자열
		int age; //10진정수
		char bloodType; //문자
		
		/*
		 * 1. 영어 대소문자를 구분한다.
		 * 2. 첫 글자는 숫자로 시작할 수 없음 ( 일반적으로 소문자로 시작 )
		 * 3. 특수문자는 ($,_)만 가능 ?_^&* 불가능 
		 * 4. 자바 에약어(키워드)는 사용 불가 
		 * 5. 변수명은 문자 수의 계산이 없다! 변수의 의미를 쉽게 알아볼 수 있도록 구체적으로 이름 지어주기!
		 * 6. bloodTyep -> 카멜표기법
		 */
		
		int studentAge; //변수를 선언
		studentAge = 20; // 변수에 값을 대입
		System.out.println(studentAge);
		
		String food = "떡볶이";
		System.out.println(food);
		
		int myAge = studentAge;
		System.out.println(myAge);
		
	}

}
