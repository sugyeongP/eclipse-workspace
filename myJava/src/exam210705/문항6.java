package exam210705;

public class 문항6 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 4, 5, 1, 2, 3 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) 	// [0] : 4 > 0 대입해서 크면 
			
				max = array[i];		// 0 = 4	값을 할당
		}
		System.out.println("max : " + max);
	}
}
