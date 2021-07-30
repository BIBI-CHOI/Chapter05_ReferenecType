package training;

public class ArrayMinMaxExample {
/*
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된
 * 최대값, 최소값을 찾아서 반환하는 메소드를 각각 다음의 형태로 구현하시오
 * public static int minValue(int[] arr) : 최소값 반환
 * public static int maxValue(int[] arr) : 최대값 반환
 * 
 */
	public static void main(String[] args) {
//		어떤 1차원 배열을 선언, 구현된 메소드 Call해서 사용하는 코드
		int[] arr = {12, 2, 30, 44, 65, 86, 5};
		
		System.out.println("최대값: " + maxValue(arr));
		System.out.println("최소값: " + minValue(arr));
	}
	
	public static int maxValue(int[] ar) {
		int maxNum = ar[0]; // arr의 첫번째 값 12
		for(int i=0; i < ar.length; i++) {
			if(ar[i] > maxNum) {
				maxNum = ar[i];
			}
		}
		return maxNum;
	}
	
	public static int minValue(int[] ar) { 
		int minNum = ar[0];
		for(int i=0; i < ar.length; i++) {
			if(ar[1] < minNum) {
				minNum = ar[i];
			}
		}
		return minNum;
	}
}
