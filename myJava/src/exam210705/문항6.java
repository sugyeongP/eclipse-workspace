package exam210705;

public class ����6 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 4, 5, 1, 2, 3 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) 	// [0] : 4 > 0 �����ؼ� ũ�� 
			
				max = array[i];		// 0 = 4	���� �Ҵ�
		}
		System.out.println("max : " + max);
	}
}
