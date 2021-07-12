package exam210705;

public class 문항15 {

	public static void main(String[] args) {

		int a, b; 	// a = 10의 자리, b = 1의 자리
		
		for(int i = 1; i < 100; i++) {
			a = i/10;					// a=0 (i:1~9) , a=1 (i:10~19) , a=2(i:20~29) , a=3 (i:30~39) ... ... 
			b = i%10;					// b=1 (i:1,11,21...91) , b=2 (i:2,12,22,32...92) , b=3 (i:3,13,23,33 ...93)
			if((a == 3 || a == 6 || a == 9 ) && (b == 3 || b == 6 || b == 9)) {		// 10의 자리와 1의 자리 모두 369
				System.out.println(i + "박수 짝짝");
			}
			else if((a == 3 || a == 6 || a == 9 ) && (b != 3 || b != 6 || b != 9)) {	// 10자리에는 369, 1의자리는 아닐때
				System.out.println(i + "박수 짝");
			}
			else if((a != 3 || a != 6 || a != 9 ) && (b == 3 || b == 6 || b == 9)) {	// 10의 자리에 369 안들어있고 1의 자리에 369가 있을때
				System.out.println(i + "박수 짝");
			}
		}
	}

}
