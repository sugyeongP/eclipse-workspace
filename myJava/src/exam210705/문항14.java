package exam210705;

public class ����14 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int total = 0;
		double avg;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1); // 1~10������ ������ ��
		}
		System.out.print("������ ������ : ");

		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
			total += array[i];
		}
		System.out.println();

		avg = (double) total / array.length;
		System.out.println("����� : " + avg);

	}

}
