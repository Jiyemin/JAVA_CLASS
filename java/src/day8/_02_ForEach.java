package day8;

public class _02_ForEach {

	public static void main(String[] args) {
		/*
		 * for( 자료형 변수열 : 배열) {
		 *       반복할 코드
		 * }   
		 *    
		 */
		
		int[] numbers = {10,20,30,40,50};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("배열 요소 : " + numbers[i]);
		}
		
		for(int i:numbers) {
			System.out.println("향상된 for문으로 도는 배열 : " + i );
		}
		
		/*
		 * Apple, Banana, Grape
		 */
		String[] fruits = {"Apple","Banana","Grape"};
		for(String i:fruits) {
			System.out.println("과일 : " + i);
		}

	}

}
