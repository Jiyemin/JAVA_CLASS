package day3;

import java.util.Scanner;

public class _05_profile {

	public static void main(String[] args) {
		/* 1. 이름
		 * 2. 주소
		 * 3. 나이
		 * 4. 키
		 * 당신의 이름은 ***입니다.
		 * 단신의 주소는 ****입니다.
		 * 당신의 나이는 *살 입니다.
		 * 당신의 키는 *cm 입니다. ( 소수점 1자리까지 포함)
		 * 출력은 printf 사용
		 */
		System.out.print("이름, 주소, 나이, 키(소수점1자리 포함) 공백으로 구분하여 입력 : ");
		Scanner Profile = new Scanner(System.in);
		String name,address;
		int age;
		double height;
			
		name = Profile.next();
		address = Profile.next();
		age = Profile.nextInt();
		height = Profile.nextDouble();
		Profile.close();
		
		System.out.printf("당신의 이름은 : %s 입니다.\n",name);
		System.out.printf("당신의 주소는 : %s 입니다.\n",address);
		System.out.printf("당신의 나이는 : %d 입니다.\n", age);
		System.out.printf("상신의 키는 : %f 입니다.",height);
		
	}

}
