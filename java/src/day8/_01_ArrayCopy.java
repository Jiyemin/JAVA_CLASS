package day8;

import java.util.Arrays;

public class _01_ArrayCopy {

	public static void main(String[] args) {
		int[] arr01 = {1,2,3};
		int[] arr02 = arr01;
		System.out.println("arr01 배열 :" + Arrays.toString(arr01));
		System.out.println("arr01 배열 :" + Arrays.toString(arr02));
		
		arr02[1] = 100;
		System.out.println("arr01 배열 :" + Arrays.toString(arr01));
		System.out.println("arr01 배열 :" + Arrays.toString(arr02));
		
		//깊은복사
		int[] numArr = {1,6,5,5,3,2};
		int[] numArrCopy = new int[numArr.length];
		for(int i = 0; i < numArr.length; i++) {
			numArrCopy[i] = numArr[i]; 
		}
		
		numArrCopy[2] = 100;
		System.out.println("numArr 배열 : " +Arrays.toString(numArr));
		System.out.println("numArrCopy 배열 : " +Arrays.toString(numArrCopy));
		
		// 1. copyOf (가져올 배열, 복사범위)
		// 2. arraycopy (복사대상배열,복사시작위치,카피형배열,시작위치,복사길이)
		int[] card = {3,1,4,5,10};
		int[] copyCard = Arrays.copyOf(card, card.length);
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.err.println("copyCord 배열 : " + Arrays.toString(copyCard));
		
		copyCard[0] = 55;
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.err.println("copyCord 배열 : " + Arrays.toString(copyCard));
		
		int[] card2 = {3,1,4,5,10};
		int[] copyCard2 = new int[card2.length];
		System.arraycopy(card2,0,copyCard2,0,card2.length);
		System.out.println("card2 배열 : " + Arrays.toString(card2));
		System.err.println("copyCord2 배열 : " + Arrays.toString(copyCard2));
		
		
		copyCard2[0] = 500;
		System.out.println("card2 배열 : " + Arrays.toString(card2));
		System.err.println("copyCord2 배열 : " + Arrays.toString(copyCard2));
	}

}
