package exam210705;

public class ����5 {

	public static void main(String[] args) {

		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		//int scores[] = { ... };
		//int score[] = new int[] { ... };
		
		//int scores[] = new int[10] { ... } // �����߻�
		
		/*
		 * int[] scores01 = new int[10];	// �迭 ����, ����
		 *  scores01[0] = 1;				// �迭 �ֱ�ȭ : �迭�� �ε���(���ȣ), �⺻���� �Ҵ�.
		 *  scores01[1] = 2;
		 *    ,,,
		 *  scores01[9] = 10;
		 */
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
	}

}
