package training;

public class ArrayMinMaxExample {
/*
 * int�� 1���� �迭�� �Ű������� ���޹޾Ƽ� �迭�� �����
 * �ִ밪, �ּҰ��� ã�Ƽ� ��ȯ�ϴ� �޼ҵ带 ���� ������ ���·� �����Ͻÿ�
 * public static int minValue(int[] arr) : �ּҰ� ��ȯ
 * public static int maxValue(int[] arr) : �ִ밪 ��ȯ
 * 
 */
	public static void main(String[] args) {
//		� 1���� �迭�� ����, ������ �޼ҵ� Call�ؼ� ����ϴ� �ڵ�
		int[] arr = {12, 2, 30, 44, 65, 86, 5};
		
		System.out.println("�ִ밪: " + maxValue(arr));
		System.out.println("�ּҰ�: " + minValue(arr));
	}
	
	public static int maxValue(int[] ar) {
		int maxNum = ar[0]; // arr�� ù��° �� 12
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
