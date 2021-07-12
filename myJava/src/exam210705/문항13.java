package exam210705;

import java.util.Scanner;

public class 문항13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int money;

		System.out.print("금액을 입력하시오 >> ");
		money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d 원짜리: %d개 \n", unit[i], money / unit[i]);
				//%d = unti[i] , %d(2) = money / unit[i] , \n = 줄바꿈
			money = money - (money / unit[i]) * unit[i];
		}
		sc.close();
	}

}
