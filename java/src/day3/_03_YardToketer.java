package day3;

import java.util.Scanner;

public class _03_YardToketer {

	public static void main(String[] args) {
		final double ONE_YARD = 0.9144;
		
		System.out.print("야드 입력 : ");
		Scanner Yardin = new Scanner(System.in);
		double yard = Yardin.nextDouble();
		Yardin.close();
		
		double meter = yard * ONE_YARD;
		System.out.println(yard + "yard는 " + meter +" meter 입니다.");
	}

}
