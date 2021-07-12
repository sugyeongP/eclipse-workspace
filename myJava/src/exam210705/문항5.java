package exam210705;

public class 문항5 {

	public static void main(String[] args) {

		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		//int scores[] = { ... };
		//int score[] = new int[] { ... };
		
		//int scores[] = new int[10] { ... } // 오류발생
		
		/*
		 * int[] scores01 = new int[10];	// 배열 선언, 생성
		 *  scores01[0] = 1;				// 배열 주기화 : 배열의 인덱스(방번호), 기본값을 할당.
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
