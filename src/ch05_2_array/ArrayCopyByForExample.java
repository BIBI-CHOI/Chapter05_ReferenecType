package ch05_2_array;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		// 배열 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		oldIntArray = newIntArray;
		oldIntArray[3] = 4;
		oldIntArray[4] = 5;
		
		for(int i=0; i<oldIntArray.length; i++) {
			System.out.print(oldIntArray[i] + " ");
		}
		System.out.println();
		System.out.println("배열 크기: " + oldIntArray.length);
		
//		for(int i=0; i<newIntArray.length; i++) {
//			System.out.print(newIntArray[i] + ", ");
//		}
	}
}
