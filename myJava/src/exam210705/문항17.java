package exam210705;

import java.util.Scanner;

public class 문항17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		String user, com;
		int n; // 컴퓨터가 랜덤하게 내는 것

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		do {
			System.out.print("가위 바위 보! >> ");
			user = sc.next();

			if (user.equals("그만"))
				break;
			n = (int) (Math.random() * 3); // n = 0, 1, 2
			com = str[n];
			if (user.equals("가위")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 비겼습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 사용자가 졌습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 사용자가 이겼습니다.");
					continue;
				}
			} else if (user.equals("바위")) {
				if (str[n].equals("바위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 비겼습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 사용자가 졌습니다.");
					continue;
				} else if (str[n].equals("가위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 사용자가 이겼습니다.");
					continue;
				}
			} else if (user.equals("보")) {
				if (str[n].equals("보")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 비겼습니다.");
					continue;
				} else if (str[n].equals("가위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 사용자가 졌습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + com + " 사용자가 이겼습니다.");
					continue;
				}
			}
			System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + " ");
		} while (true);
		System.out.println("게임을 종료합니다...");
		sc.close();
	}

}
