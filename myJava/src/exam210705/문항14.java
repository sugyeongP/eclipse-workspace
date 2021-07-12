package exam210705;

public class 문항14 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int total = 0;
		double avg;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1); // 1~10까지의 랜덤한 값
		}
		System.out.print("랜덤한 정수들 : ");

		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
			total += array[i];
		}
		System.out.println();

		avg = (double) total / array.length;
		System.out.println("평균은 : " + avg);

	}

}
